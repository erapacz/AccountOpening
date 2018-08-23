package com.capgemini.accountopening.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.NomineeDetails;

@Controller
public class NomineeDetailsController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/nomineeDetails", method = RequestMethod.GET)
    public String getNomineeDetailsForm(Model model) {
		model.addAttribute("nomineeDetails", new NomineeDetails());
		return "nomineeDetails";
    }
	
	@RequestMapping(value="/nomineeDetails", method=RequestMethod.POST)
    public String test(@Valid NomineeDetails nomineeDetails,BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "nomineeDetails";
		}
		customer.setNomineeDetails(nomineeDetails);
        return "confirmation";
    }
	
}