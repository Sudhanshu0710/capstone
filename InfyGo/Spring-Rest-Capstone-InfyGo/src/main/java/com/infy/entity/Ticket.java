package com.infy.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_details")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pnr")
	private Integer pnr;
	private LocalDate bookingDate;
	private LocalDate departureDate;
	private LocalTime departureTime;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "flight_id")
	private Flight flight;
	private Integer noOfSeats;
	private Double totalFare;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	private User user;
	@OneToMany(mappedBy = "ticket")
	private Set<Passenger> passengers;
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ticket(Integer pnr, LocalDate bookingDate, LocalDate departureDate, LocalTime departureTime, Flight flight,
			Integer noOfSeats, Double totalFare, User user, Set<Passenger> passengers) {
		super();
		this.pnr = pnr;
		this.bookingDate = bookingDate;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.flight = flight;
		this.noOfSeats = noOfSeats;
		this.totalFare = totalFare;
		this.user = user;
		this.passengers = passengers;
	}


	public Integer getPnr() {
		return pnr;
	}


	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}


	public LocalDate getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}


	public LocalDate getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}


	public LocalTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public Integer getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public Double getTotalFare() {
		return totalFare;
	}


	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Set<Passenger> getPassengers() {
		return passengers;
	}


	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}


	@Override
	public int hashCode() {
		return Objects.hash(pnr);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(pnr, other.pnr);
	}


	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", bookingDate=" + bookingDate + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", flight=" + flight + ", noOfSeats=" + noOfSeats
				+ ", totalFare=" + totalFare + ", user=" + user + ", passengers=" + passengers + "]";
	}
	
	
}
