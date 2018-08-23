package com.capgemini.accountopening.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.PersonalDetails;

@Controller
public class PersonalDetailsController {

	@Autowired
	private Customer customer;
	
	@GetMapping("/personalDetails")
    public String showForm(PersonalDetails personalDetails) {
		return "personalDetails";
    }
	
	@PostMapping("/personalDetails")
    public String checkPersonalDetails(@Valid PersonalDetails personalDetails, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "personalDetails";
		}
		customer.setPersonalDetails(personalDetails);
        return "contactDetails";
    }
	

	
}