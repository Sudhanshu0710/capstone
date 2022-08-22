package com.infy.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightDTO {
	@NotNull(message = "flight.flightid.null")
	@NotBlank(message = "flight.flightid.blank")
	@Pattern(regexp = "^F[A-Z]{2}[1-9][0-9]{3}$", message = "flight.flightid.invalid")
	private String flightId;
	private String airlines;
	@DateTimeFormat(pattern = "HH:mm")
//	@FutureOrPresent(message = "flight.arrivaltime.invalid")
	private LocalTime arrivalTime;
	@DateTimeFormat(pattern = "HH:mm")
//	@FutureOrPresent(message = "flight.departuretime.invalid")
	private LocalTime departureTime;
	private String destination;
	private Double fare;
	@FutureOrPresent(message = "flight.availabledate.invalid")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate flightAvailableDate;
	private Integer seatCount;
	private String source;
	
	public FlightDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightDTO(
			@NotNull(message = "flight.flightid.null") @NotBlank(message = "flight.flightid.blank") @Pattern(regexp = "^F[A-Z]{2}[1-9][0-9]{3}$", message = "flight.flightid.invalid") String flightId,
			String airlines, LocalTime arrivalTime, LocalTime departureTime, String destination, Double fare,
			@FutureOrPresent(message = "flight.availabledate.invalid") LocalDate flightAvailableDate, Integer seatCount,
			String source) {
		super();
		this.flightId = flightId;
		this.airlines = airlines;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.destination = destination;
		this.fare = fare;
		this.flightAvailableDate = flightAvailableDate;
		this.seatCount = seatCount;
		this.source = source;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public LocalDate getFlightAvailableDate() {
		return flightAvailableDate;
	}

	public void setFlightAvailableDate(LocalDate flightAvailableDate) {
		this.flightAvailableDate = flightAvailableDate;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDTO other = (FlightDTO) obj;
		return Objects.equals(flightId, other.flightId);
	}

	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", airlines=" + airlines + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", destination=" + destination + ", fare=" + fare
				+ ", flightAvailableDate=" + flightAvailableDate + ", seatCount=" + seatCount + ", source=" + source
				+ "]";
	}
	

}
