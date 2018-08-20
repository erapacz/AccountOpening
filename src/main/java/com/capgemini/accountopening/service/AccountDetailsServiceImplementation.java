package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;

public class AccountDetailsServiceImplementation implements AccountDetailsService{

	@Autowired
	AccountDetailsRepository accountDetailsRepo;
	
	@Override
	public void saveAccountDetails(AccountDetails accountDetails) {
		accountDetailsRepo.save(accountDetails);
	}

	@Override
	public AccountDetails getAccountDetailsById(long id) {
		return accountDetailsRepo.getOne(id);
	}
	
}
