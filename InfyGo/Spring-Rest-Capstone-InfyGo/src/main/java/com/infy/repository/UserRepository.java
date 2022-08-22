package com.infy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.User;

 

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	public List<User> findByName(String name);
	public List<User> findByEmail(String email);
	public List<User> findByNameAndPassword(String name, String password);
	public Optional<User> findByNameAndEmail(String name, String email);
	public Optional<User> findByNameAndPasswordAndEmail(String name, String password, String email);

}
