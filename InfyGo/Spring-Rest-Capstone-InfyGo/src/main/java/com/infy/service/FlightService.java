package com.infy.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.infy.dto.FlightDTO;
import com.infy.exception.InfyGoException;

public interface FlightService {
	public FlightDTO addFlight(FlightDTO flightDTO) throws InfyGoException;
	
	public Set<FlightDTO> addFlights(List<FlightDTO> flightsDTO)  throws InfyGoException;

	public Set<FlightDTO> fetchFlightForSource(String source) throws InfyGoException;

	public Set<FlightDTO> fetchFlightForDestination(String destination) throws InfyGoException;
	public Set<FlightDTO> fetchFlightForSourceDestinationAndJourneyDate(Map<String, List<String>> sources,
			Map<String, List<String>> destinations, LocalDate journeyDate) throws InfyGoException;
}
