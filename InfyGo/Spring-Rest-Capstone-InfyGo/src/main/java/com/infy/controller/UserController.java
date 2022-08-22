package com.infy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.UserDTO;
import com.infy.exception.InfyGoException;
import com.infy.service.UserService;

@RestController
@RequestMapping(value = "/users")
@Validated
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/register", consumes = "application/json")
	public ResponseEntity<UserDTO> registerUser(@Valid @RequestBody UserDTO userDTO) throws InfyGoException{
		UserDTO response = this.userService.registerUser(userDTO);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping(value="/login", consumes = "application/json")
	public ResponseEntity<UserDTO> loginUser(@Valid @RequestBody UserDTO userDTO) throws InfyGoException{
		UserDTO response = this.userService.loginUser(userDTO);
		return ResponseEntity.ok(response);
	}
}
