package com.capgemini.accountopening.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {
	
	public Optional<ContactDetails> findByCustomerId(Long id);

}
