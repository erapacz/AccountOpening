package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.ContactDetails;

import com.capgemini.accountopening.model.Nominee;

import com.capgemini.accountopening.model.Customer;

import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;
import com.capgemini.accountopening.repository.ContactDetailsRepository;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

@Controller
public class WebController {
	
	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	
	@Autowired
	private ContactDetailsRepository contactDetailsRepository;
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
		
	@RequestMapping(value="/confirmation", method=RequestMethod.GET)
    public String confimationForm(Model model) {
        model.addAttribute("nominee", new Nominee());
        return "confirmation";
    }
	
	@RequestMapping(value="/confirmation", method=RequestMethod.POST)
	public String toConfimation(Model model) {
		return "confirmation";
	}

}