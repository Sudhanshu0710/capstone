package com.infy.service;

import java.util.List;

import com.infy.dto.CreditcardDTO;
import com.infy.dto.PassengerDTO;
import com.infy.dto.TicketDTO;
import com.infy.exception.InfyGoException;

public interface BookingService {
	public TicketDTO bookTicket(String flightId, String userId, List<PassengerDTO> passengerDTOs) throws InfyGoException;
	public String makePayment(CreditcardDTO creditcardDTO)  throws InfyGoException;
}
