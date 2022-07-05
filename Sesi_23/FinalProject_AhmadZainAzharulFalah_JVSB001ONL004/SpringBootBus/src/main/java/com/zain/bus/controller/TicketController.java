package com.zain.bus.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zain.bus.model.Ticket;
import com.zain.bus.model.TripSchedule;
import com.zain.bus.model.User;
import com.zain.bus.payload.request.TicketRequest;
import com.zain.bus.payload.response.MessageResponse;
import com.zain.bus.repository.TicketRepository;
import com.zain.bus.repository.TripScheduleRepository;
import com.zain.bus.repository.UserRepository;

import io.swagger.annotations.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	TripScheduleRepository tripScheduleRepository;

	@GetMapping("/")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getAll() {
		List<TicketRequest> dataArrResult = new ArrayList<>();
		for (Ticket dataArr : ticketRepository.findAll()) {
			dataArrResult.add(new TicketRequest(dataArr.getId(), dataArr.getCancellable(), dataArr.getJourneyDate(),
					dataArr.getSeatNumber(), dataArr.getPassenger().getId(), dataArr.getTripSchedule().getId()));
		}
		return ResponseEntity
				.ok(new MessageResponse<TicketRequest>(true, "Data retrieved successfully.", dataArrResult));
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	public ResponseEntity<?> getTicketById(@PathVariable(value = "id") Long id) {
		Ticket ticket = ticketRepository.findById(id).get();
		if (ticket == null) {
			return ResponseEntity.notFound().build();
		} else {
			TicketRequest dataResult = new TicketRequest(ticket.getId(), ticket.getCancellable(),
					ticket.getJourneyDate(), ticket.getSeatNumber(), ticket.getPassenger().getId(),
					ticket.getTripSchedule().getId());
			return ResponseEntity
					.ok(new MessageResponse<TicketRequest>(true, "Data retrieved successfully.", dataResult));
		}
	}

	@PostMapping("/")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> addTicket(@Valid @RequestBody TicketRequest ticketRequest) {
		User user = userRepository.findById(ticketRequest.getPassegerId()).get();
		TripSchedule tripSchedule = tripScheduleRepository.findById(ticketRequest.getTripScheduleId()).get();
		Ticket ticket = new Ticket(ticketRequest.getSeatNumber(), ticketRequest.getCancellable(),
				ticketRequest.getJourneyDate(), user, tripSchedule);
		ticketRepository.save(ticket);
		return ResponseEntity.ok(new MessageResponse<Ticket>(true, "Data added successfully."));
	}

	@PutMapping("/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateTicket(@PathVariable(value = "id") Long id,
			@Valid @RequestBody TicketRequest ticketDetail) {
		Ticket ticket = ticketRepository.findById(id).get();
		User user = userRepository.findById(ticketDetail.getPassegerId()).get();
		TripSchedule tripSchedule = tripScheduleRepository.findById(ticketDetail.getTripScheduleId()).get();
		if (ticket == null) {
			return ResponseEntity.notFound().build();
		}
		ticket.setCancellable(ticketDetail.getCancellable());
		ticket.setJourneyDate(ticketDetail.getJourneyDate());
		ticket.setSeatNumber(ticketDetail.getSeatNumber());
		ticket.setPassenger(user);
		ticket.setTripSchedule(tripSchedule);

		Ticket updatedTicket = ticketRepository.save(ticket);

		return ResponseEntity.ok(new MessageResponse<Ticket>(true, "Data updated successfully."));
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> deleteTicket(@PathVariable(value = "id") Long id) {
		String result = "";
		try {
			ticketRepository.findById(id).get();

			result = "Data with ID: " + id + " deleted successfully.";
			ticketRepository.deleteById(id);

			return ResponseEntity.ok(new MessageResponse<Ticket>(true, result));
		} catch (Exception e) {
			result = "Data with ID: " + id + " not found.";
			return ResponseEntity.ok(new MessageResponse<Ticket>(false, result));
		}
	}

}
