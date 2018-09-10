// Account Login Controller

package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.service.AccountDetailsServiceImplementation;

@RestController
public class LoginController {
	
	@Autowired(required = true)
	private AccountDetailsServiceImplementation accountDetailsService;

	
	@RequestMapping(value="/login/accountDetails/{customerId}",method=RequestMethod.GET)
	public AccountDetails findAccountDetails(@PathVariable ("customerId") String customerId) {
		
		AccountDetails accountDetails = accountDetailsService.findByCustomerId(new Long(customerId));
		
		
		return accountDetails;
	}
	
}
