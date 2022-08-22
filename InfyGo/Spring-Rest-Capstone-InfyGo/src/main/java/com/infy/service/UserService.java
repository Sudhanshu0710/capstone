package com.infy.service;

import com.infy.dto.UserDTO;
import com.infy.exception.InfyGoException;

public interface UserService {
	public UserDTO registerUser(UserDTO userDTO) throws InfyGoException;

	public UserDTO loginUser(UserDTO userDTO) throws InfyGoException;
}
