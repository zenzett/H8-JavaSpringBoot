package com.belajar.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Book;
import com.belajar.spring.repository.BookRepository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {

	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = new Book();
		book1.setTitle("Harry Potter");
		book1.setWriter("J. K. Rowling");
		book1.setIsbn("IS-202509");

		Book book2 = new Book();
		book2.setTitle("The Hunger Games");
		book2.setWriter("Suzanne Collins");
		book2.setIsbn("IS-9090890");

		bookRepository.save(book1);
		bookRepository.save(book2);

	}

}
