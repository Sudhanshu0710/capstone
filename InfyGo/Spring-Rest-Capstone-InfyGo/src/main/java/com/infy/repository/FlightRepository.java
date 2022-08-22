package com.infy.repository;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String>{
	
	public Set<Flight> findBySource(String source);

	public Set<Flight> findByDestination(String destination);
	
	@Query(value = "SELECT f FROM Flight f WHERE f.source IN :sources AND f.destination IN :destinations AND f.flightAvailableDate = :journeyDate")
	public Set<Flight> findAllFlightsForGivenSourcesDestinationAndJourneyDate(@Param("sources") Set<String> sources,
			@Param("destinations") Set<String> destinations, @Param("journeyDate") LocalDate journeyDate);
}
