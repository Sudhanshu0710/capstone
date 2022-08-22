package com.infy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.CreditcardDTO;
import com.infy.exception.InfyGoException;
import com.infy.service.BookingService;

@RestController
@RequestMapping("/payment")
@Validated
public class PaymentController {
	
	@Autowired
	private BookingService bookingService;

	@PostMapping(consumes = "application/json")
	public ResponseEntity<String> makePayment(@Valid @RequestBody CreditcardDTO creditcardDTO) throws InfyGoException {
		String response = this.bookingService.makePayment(creditcardDTO);
		return ResponseEntity.ok(response);
	}
}
