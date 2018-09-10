package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;

@Service("accountService")
public class AccountDetailsServiceImplementation implements AccountDetailsService{

	@Autowired
	AccountDetailsRepository accountDetailsRepo;
	
	@Override
	public AccountDetails saveAccountDetails(AccountDetails accountDetails) {
		return accountDetailsRepo.save(accountDetails);
	}

	@Override
	public AccountDetails getAccountDetailsById(String id) {
		return accountDetailsRepo.findByAccNumber(id).get();
	}

	@Override
	public AccountDetails findByCustomerId(Long customerId) {
		return accountDetailsRepo.findByCustomerId(customerId);
	}
}
