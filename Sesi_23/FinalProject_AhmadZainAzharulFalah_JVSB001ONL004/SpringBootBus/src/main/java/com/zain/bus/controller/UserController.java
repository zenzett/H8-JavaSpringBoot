package com.zain.bus.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zain.bus.model.Agency;
import com.zain.bus.model.ERole;
import com.zain.bus.model.Role;
import com.zain.bus.model.User;
import com.zain.bus.payload.request.SignupCustomRequest;
import com.zain.bus.payload.request.UserCustomRequest;
import com.zain.bus.payload.request.UserPasswordRequest;
import com.zain.bus.payload.response.MessageResponse;
import com.zain.bus.repository.AgencyRepository;
import com.zain.bus.repository.RoleRepository;
import com.zain.bus.repository.UserRepository;
import com.zain.bus.security.jwt.JwtUtils;

import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@CrossOrigin(origins = "*", maxAge = 3600, methods = { RequestMethod.PUT, RequestMethod.POST, RequestMethod.GET })
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	AgencyRepository agencyRepository;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupCustomRequest signupCustomRequest) {
		if (userRepository.existsByUsername(signupCustomRequest.getUsername())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is not available."));
		}

		if (userRepository.existsByEmail(signupCustomRequest.getEmail())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is not available."));
		}

		// Create new user's account
		User user = new User(signupCustomRequest.getFirstName(), signupCustomRequest.getLastName(),
				signupCustomRequest.getMobileNumber(), signupCustomRequest.getUsername(),
				signupCustomRequest.getEmail(), encoder.encode(signupCustomRequest.getPassword()));

		Set<String> strRoles = signupCustomRequest.getRole();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role userRole = roleRepository.findByName(ERole.ROLE_USER)
					.orElseThrow(() -> new RuntimeException("Error: Role is not available."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not available."));
					roles.add(adminRole);
					break;
				default:
					Role userRole = roleRepository.findByName(ERole.ROLE_USER)
							.orElseThrow(() -> new RuntimeException("Error: Role is not available."));
					roles.add(userRole);
				}
			});
		}

		user.setRoles(roles);
		userRepository.save(user);

		Agency agency = new Agency(signupCustomRequest.getCode(), signupCustomRequest.getDetails(),
				signupCustomRequest.getName(), user);
		agencyRepository.save(agency);

		return ResponseEntity.ok(new MessageResponse("User registration success."));
	}

	@PutMapping("/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<?> updateUser(@PathVariable(value = "id") Long id,
			@Valid @RequestBody UserCustomRequest userCustomRequest) {
		User user = userRepository.findById(id).get();
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		user.setFirstName(userCustomRequest.getFirstName());
		user.setLastName(userCustomRequest.getLastName());
		user.setMobileNumber(userCustomRequest.getMobileNumber());

		User updatedUser = userRepository.save(user);

		return ResponseEntity.ok(updatedUser);
	}

	@PutMapping("/password/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<?> updatePassword(@PathVariable(value = "id") Long id,
			@Valid @RequestBody UserPasswordRequest userPasswordRequest) {
		User user = userRepository.findById(id).get();
		if (user == null) {
			return ResponseEntity.notFound().build();
		}

		user.setPassword(encoder.encode(userPasswordRequest.getPassword()));

		User updatedUser = userRepository.save(user);

		return ResponseEntity.ok(updatedUser);
	}
}
