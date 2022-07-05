package com.zain.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zain.bus.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
