package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

@Controller
public class ContactDetailsController {

	@Autowired
	private ContactDetailsRepository contactDetailsRepository;
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.GET)
    public String getContactDetailsForm(Model model) {
        model.addAttribute("contactDetails", new ContactDetails());
        return "contactDetails";
    }
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.POST)
    public String toContactDetails(Model model) {
        return "contactDetails";
    }
}