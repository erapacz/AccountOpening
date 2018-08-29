package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.service.AccountDetailsService;

@RestController
public class VerificationDetailsController {

	@Autowired
	private AccountDetailsService accountDetailsService;
	
	@GetMapping("/accNum/{accNum}")
	public AccountDetails getAccDetails(@PathVariable ("accNum") String accNum){
		return accountDetailsService.getAccountDetailsById(accNum);
	} 
}
