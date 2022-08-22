package com.infy.dto;

import java.util.Objects;

import javax.validation.constraints.Pattern;

public class PassengerDTO {
	
	private Integer passengerId;
	private Integer passengerAge;
	@Pattern(regexp = "^[MFO]$", message = "{passenger.gender.invalid}")
	private String passengerGender;
	private String passengerName;
	private TicketDTO ticket;
	
	public PassengerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerDTO(Integer passengerId, Integer passengerAge,
			@Pattern(regexp = "^[MFO]$", message = "{passenger.gender.invalid}") String passengerGender,
			String passengerName, TicketDTO ticket) {
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

	public TicketDTO getTicket() {
		return ticket;
	}

	public void setTicket(TicketDTO ticket) {
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
		PassengerDTO other = (PassengerDTO) obj;
		return Objects.equals(passengerId, other.passengerId);
	}

	@Override
	public String toString() {
		return "PassengerDTO [passengerId=" + passengerId + ", passengerAge=" + passengerAge + ", passengerGender="
				+ passengerGender + ", passengerName=" + passengerName + ", ticket=" + ticket + "]";
	}
	

}
