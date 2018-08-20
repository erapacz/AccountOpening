package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.NomineeDetails;

@Controller
public class NomineeDetailsController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/nomineeDetails", method = RequestMethod.GET)
    public String getNomineeDetailsForm() {
		return "nomineeDetails";
    }
	
	@RequestMapping(value="/nomineeDetails", method=RequestMethod.POST)
    public String test(NomineeDetails nomineeDetails){
		customer.setNomineeDetails(nomineeDetails);
        return "confirmation";
    }
	
}

