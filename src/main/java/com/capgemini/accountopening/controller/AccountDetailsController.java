package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.Customer;

@Controller
public class AccountDetailsController {
	
	@Autowired
	private Customer customer;
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.GET)
	public String getAccountDetailsForm() {
		return "accountDetails";
	}
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.POST)
    public String toAccountDetails(AccountDetails accountDetails) {
		customer.setAccountDetails(accountDetails);
		if(accountDetails.getHasNominee().equals("true"))
			return "nomineeDetails";
		return "confirmation";
    }
	
}
					