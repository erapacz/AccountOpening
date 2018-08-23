package com.capgemini.accountopening.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Customer;

@Controller
public class ContactDetailsController {

	@Autowired
	private Customer customer;
	
	
	@GetMapping(value = "/contactDetails")
    public String getContactDetailsForm() {
		return "contactDetails";
    }
	
	
	@PostMapping(value="/contactDetails")
    public String test(@Valid ContactDetails contactDetails, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "contactDetails";
		}
		customer.setContactDetails(contactDetails);
        return "accountDetails";
    }
}