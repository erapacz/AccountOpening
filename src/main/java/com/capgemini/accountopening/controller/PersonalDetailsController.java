package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.PersonalDetails;

@Controller
public class PersonalDetailsController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/personalDetails", method = RequestMethod.GET)
    public String getPersonalDetailsForm() {
		return "personalDetails";
    }
	
	@RequestMapping(value="/personalDetails", method=RequestMethod.POST)
    public String test(PersonalDetails personalDetails){
		//personalDetailsService.savePersonalDetails(personalDetails);
		customer.setPersonalDetails(personalDetails);
        return "contactDetails";
    }
	

	
}