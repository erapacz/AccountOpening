package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

@Controller
public class PersonalDetailsController {

	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String home(Model model) {
		model.addAttribute("customer", new Customer());
        return "index";
    }
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
    public String saveAll(@ModelAttribute Customer customer, Model model) {
		model.addAttribute("customer", customer);
//		personalDetailsRepository.save(customer.getPersonalDetails());
//		contactDetailsRepository.save(customer.getContactDetails());
//		accountDetailsRepository.save(customer.getAccountDetails());
		System.out.println(customer.getPersonalDetails());
		System.out.println(customer.getContactDetails());
		System.out.println(customer.getAccountDetails());
		return "index";
    }
	
	@RequestMapping(value="/personalDetails", method=RequestMethod.GET)
    public String getPersonalDetailsForm(Model model) {
        model.addAttribute("user", new PersonalDetails());
        return "personalDetails";
    }

}