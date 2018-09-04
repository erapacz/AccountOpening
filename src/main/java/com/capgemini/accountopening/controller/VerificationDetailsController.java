package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.model.VerificationDetails;
import com.capgemini.accountopening.service.AccountDetailsServiceImplementation;
import com.capgemini.accountopening.service.PersonalDetailsServiceImplementation;

@RestController
public class VerificationDetailsController {

	@Autowired
	private AccountDetailsServiceImplementation accountDetailsService;
	
	@Autowired
	private PersonalDetailsServiceImplementation personalDetailsService;
	
	@GetMapping(value="/verify/account/{accNum}")
	public @ResponseBody VerificationDetails getAccDetails(@PathVariable ("accNum") String accNum){
		AccountDetails account;
		PersonalDetails personal;
		VerificationDetails verify = new VerificationDetails();

		try {
			account = accountDetailsService.getAccountDetailsById(accNum);
			personal = personalDetailsService.getPersonalDetailsById(account.getCustomerId());
			verify.setAccNum(accNum);
			verify.setDob(personal.getDob());
			verify.setMaiden(personal.getMotherMName());
			verify.setSsn(personal.getSsn());
		} catch(Exception e) {
			verify.setAccNum(accNum);
			verify.setDob(null);
			verify.setMaiden(null);
			verify.setSsn(null);
		}
		return verify;
	}
	
}
