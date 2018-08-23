package com.capgemini.accountopening.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.NomineeDetails;

@Controller
public class NomineeDetailsController {

	@Autowired
	private Customer customer;

	@GetMapping("/nomineeDetails")
	public String ShowForm(NomineeDetails nomineeDetails) {
		return "nomineeDetails";
	}

	@PostMapping("/nomineeDetails")
	public String checkNomineeDetails(@Valid NomineeDetails nomineeDetails, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "nomineeDetails";
		}
		customer.setNomineeDetails(nomineeDetails);
		return "confirmation";
	}

}