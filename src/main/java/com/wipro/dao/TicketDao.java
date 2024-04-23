package com.wipro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {

}
