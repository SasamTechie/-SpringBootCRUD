package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dao.TicketDao;
import com.wipro.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTickets(@RequestBody List<Ticket> tickets) {

		dao.saveAll(tickets);

		return "ticket booked:" + tickets.size();

	}

	@PostMapping("/getTickets")
	public List<Ticket> getTickets() {

		return dao.findAll();

	}

}
