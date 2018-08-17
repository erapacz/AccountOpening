package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.service.ContactDetailsService;

@Controller
public class ContactDetailsController {

	@Autowired
	private ContactDetailsService contactDetailsService;
	
	@RequestMapping(value = "/contactDetails", method = RequestMethod.GET)
    public String getContactDetailsForm() {
		return "contactDetails";
    }
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.POST)
    public @ResponseBody ContactDetails test(ContactDetails contactDetails){
		contactDetailsService.saveContactDetails(contactDetails);
        return contactDetails;
    }
}