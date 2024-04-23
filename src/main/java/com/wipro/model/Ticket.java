package com.wipro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Ticket {
	@Id
	@GeneratedValue
	private int ticketId;

	@SuppressWarnings("unused")
	private double ticketAmount;

	@SuppressWarnings("unused")
	private String ticketCategory;

}
