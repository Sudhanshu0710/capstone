package com.infy.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_details")
public class Passenger {
	
	@Id
	@Column(name = "passenger_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passengerId;
	private Integer passengerAge;
	private String passengerGender;
	private String passengerName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "pnr")
	private Ticket ticket;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(Integer passengerId, Integer passengerAge, String passengerGender, String passengerName,
			Ticket ticket) {
		super();
		this.passengerId = passengerId;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.passengerName = passengerName;
		this.ticket = ticket;
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public int hashCode() {
		return Objects.hash(passengerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return Objects.equals(passengerId, other.passengerId);
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerAge=" + passengerAge + ", passengerGender="
				+ passengerGender + ", passengerName=" + passengerName + ", ticket=" + ticket + "]";
	}
	
	
}
