package com.capgemini.accountopening.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.NomineeDetails;

@Controller
public class NomineeDetailsController implements WebMvcConfigurer{

	@Autowired
	private Customer customer;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/confirmation").setViewName("confirmation");
	}

	@GetMapping("/nomineeDetails")
	public String ShowForm(Model model) {
		model.addAttribute("nomineeDetails", new NomineeDetails());
		return "nomineeDetails";
	}

	@PostMapping("/nomineeDetails")
	public String checkNomineeDetails(@Valid NomineeDetails nomineeDetails, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "nomineeDetails";
		}
		customer.setNomineeDetails(nomineeDetails);
		return "redirect:/confirmation";
	}

}