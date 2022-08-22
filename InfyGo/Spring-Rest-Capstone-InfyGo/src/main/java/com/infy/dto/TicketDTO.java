package com.infy.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Set;

public class TicketDTO {
	
	private Integer pnr;
	private LocalDate bookingDate;
	private LocalDate departureDate;
	private LocalTime departureTime;
	private FlightDTO flight;
	private Integer noOfSeats;
	private Double totalFare;
	private UserDTO user;
	private Set<PassengerDTO> passengers;
	
	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketDTO(Integer pnr, LocalDate bookingDate, LocalDate departureDate, LocalTime departureTime,
			FlightDTO flight, Integer noOfSeats, Double totalFare, UserDTO user, Set<PassengerDTO> passengers) {
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

	public FlightDTO getFlight() {
		return flight;
	}

	public void setFlight(FlightDTO flight) {
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

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Set<PassengerDTO> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<PassengerDTO> passengers) {
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
		TicketDTO other = (TicketDTO) obj;
		return Objects.equals(pnr, other.pnr);
	}

	@Override
	public String toString() {
		return "TicketDTO [pnr=" + pnr + ", bookingDate=" + bookingDate + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", flight=" + flight + ", noOfSeats=" + noOfSeats
				+ ", totalFare=" + totalFare + ", user=" + user + ", passengers=" + passengers + "]";
	}
	
}
