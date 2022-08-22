package com.infy.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.dto.UserDTO;
import com.infy.entity.User;
import com.infy.exception.InfyGoException;
import com.infy.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	public Set<UserDTO> loggedInUsers;
	
	public UserServiceImpl() { this.loggedInUsers = new HashSet<>(); }

	@Override
	public UserDTO loginUser(UserDTO userDTO) throws InfyGoException {
		Optional<User> userOptional = userRepository.findByNameAndEmail(userDTO.getName(), userDTO.getEmail());
		User user = userOptional.orElseThrow(() -> new InfyGoException("user.not.found"));
		if (!user.getPassword().equals(userDTO.getPassword())) throw new InfyGoException("user.password.incorrect");
		userDTO = this.modelMapper.map(user, UserDTO.class);
		loggedInUsers.add(userDTO);
		return userDTO;
	}
	
	@Override
	public UserDTO registerUser(UserDTO userDTO) throws InfyGoException {
		Optional<User> userOptional = this.userRepository.findByNameAndEmail(userDTO.getName(), userDTO.getEmail());
		if (userOptional.isPresent()) throw new InfyGoException("user.already.exists");
		User user = this.modelMapper.map(userDTO, User.class);
		User userSaved = this.userRepository.save(user);
		System.out.println(userSaved);
		return this.modelMapper.map(userSaved, UserDTO.class);
	}
}
