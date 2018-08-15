package com.capgemini.accountopening.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;

@Controller
public class AccountDetailsController {
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.GET)
	public String getAccountDetailsForm(Model model) {
		model.addAttribute("accountDetails", new AccountDetails());
		return "accountDetails";
	}
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.POST)
    public String toAccountDetails(Model model) {
		return "accountDetails";
    }
	
}
