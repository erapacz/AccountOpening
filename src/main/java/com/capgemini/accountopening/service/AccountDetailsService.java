package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;

@Service
public interface AccountDetailsService {
	
	public void saveAccountDetails(AccountDetails accountDetails);
	
	public AccountDetails getAccountDetailsById(long id);
	
	@Service
	static class AccountDetailsServiceImplementation implements AccountDetailsService{

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
	
}
