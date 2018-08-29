package com.capgemini.accountopening.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.PersonalDetails;


public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {

	public Optional<PersonalDetails> findById(Long id);
	
}
