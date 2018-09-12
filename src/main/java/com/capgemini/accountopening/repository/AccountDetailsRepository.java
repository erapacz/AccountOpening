package com.capgemini.accountopening.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, String>{
	
	public Optional<AccountDetails> findByAccNumber(String id);

	public AccountDetails findByCustomerId(Long customerId);

}
