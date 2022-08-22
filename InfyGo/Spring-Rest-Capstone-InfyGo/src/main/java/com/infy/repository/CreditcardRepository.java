package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Creditcard;

@Repository
public interface CreditcardRepository extends JpaRepository<Creditcard, String>{

}
