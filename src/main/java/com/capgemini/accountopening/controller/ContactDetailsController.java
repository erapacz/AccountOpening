package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Customer;

@Controller
public class ContactDetailsController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/contactDetails", method = RequestMethod.GET)
    public String getContactDetailsForm() {
		return "contactDetails";
    }
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.POST)
    public String test(ContactDetails contactDetails){
		//contactDetailsService.saveContactDetails(contactDetails);
		customer.setContactDetails(contactDetails);
        return "accountDetails";
    }
}