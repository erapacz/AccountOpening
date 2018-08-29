package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.service.AccountDetailsServiceImplementation;
import com.capgemini.accountopening.service.PersonalDetailsServiceImplementation;

@RestController
public class VerificationDetailsController {

	@Autowired
	private AccountDetailsServiceImplementation accountDetailsService;
	
	@Autowired
	private PersonalDetailsServiceImplementation personalDetailsService;
	
	@PostMapping("/verify/account/{accNum}")
	public AccountDetails getAccDetails(@PathVariable ("accNum") String accNum){
		AccountDetails account;
		PersonalDetails personal;
		try {
			account = accountDetailsService.getAccountDetailsById(accNum);
			personal = personalDetailsService.getPersonalDetailsById(account.getCustomerId());
		} catch(Exception e) {
			account = new AccountDetails();
			account.setAccNumber(accNum);
		}
		return account;
		
	}
	
//	@PostMapping("/verify/personal/{custId}")
//	public PersonalDetails getPerDetails(@PathVariable ("custId") Long custId){
//		PersonalDetails person;
//		try {
//			person = personalDetailsService.getPersonalDetailsById(custId);
//		} catch(Exception e) {
//			person = new PersonalDetails();
//			person.set(accNum);
//		}
//		return account;
//	}
}
