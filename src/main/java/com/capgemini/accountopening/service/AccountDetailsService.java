package com.capgemini.accountopening.service;

import com.capgemini.accountopening.model.AccountDetails;

public interface AccountDetailsService {
	
	AccountDetails saveAccountDetails(AccountDetails accountDetails);
	
	AccountDetails getAccountDetailsById(String accNum);

	AccountDetails findByCustomerId(Long customerId);
}
