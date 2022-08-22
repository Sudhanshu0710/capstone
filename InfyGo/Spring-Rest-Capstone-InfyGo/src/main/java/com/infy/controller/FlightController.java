package com.infy.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.infy.dto.FlightDTO;
import com.infy.exception.InfyGoException;
import com.infy.service.FlightService;

@RestController
@RequestMapping(value = "/flights")
@Validated
public class FlightController {
	
	@Autowired
	private FlightService flightService;

	@GetMapping(value = "/sources")
	public ResponseEntity<Set<FlightDTO>> getFlightFromSource(@RequestParam("source") String source)
			throws InfyGoException {
		Set<FlightDTO> response = this.flightService.fetchFlightForSource(source);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "/destinations")
	public ResponseEntity<Set<FlightDTO>> getFlightFromDestination(@RequestParam("destination") String destination)
			throws InfyGoException {

		Set<FlightDTO> response = this.flightService.fetchFlightForDestination(destination);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "/{source}/{destination}/{journeydate}")
	public ResponseEntity<Set<FlightDTO>> getFlightFromSourceDestinationJourneyDate(
			@MatrixVariable(pathVar = "source") Map<String, List<String>> sources,
			@MatrixVariable(pathVar = "destination") Map<String, List<String>> destinations,
			@MatrixVariable(pathVar = "journeydate", name = "journeydate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate journeyDate)
			throws InfyGoException {
		Set<FlightDTO> response = this.flightService.fetchFlightForSourceDestinationAndJourneyDate(sources,
				destinations, journeyDate);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping(value = "/add", consumes = "application/json")
	public ResponseEntity<FlightDTO> addFlight(@Valid @RequestBody FlightDTO flightDTO) throws InfyGoException {
		FlightDTO response = this.flightService.addFlight(flightDTO);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping(value = "/addAll", consumes = "application/json")
	public ResponseEntity<Set<FlightDTO>> addAllFlights(@Valid @RequestBody List<FlightDTO> flightsDTO)
			throws InfyGoException {
		Set<FlightDTO> response = this.flightService.addFlights(flightsDTO);
		return ResponseEntity.ok(response);
	}

}
