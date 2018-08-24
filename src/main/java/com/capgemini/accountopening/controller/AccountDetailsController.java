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

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Customer;

@Controller
public class AccountDetailsController implements WebMvcConfigurer{
	
	@Autowired
	private Customer customer;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/nomineeDetails").setViewName("nomineeDetails");
		registry.addViewController("/confirmation").setViewName("confirmation");
	}
	
	@GetMapping("/accountDetails")
	public String getAccountDetailsForm(Model model) {
		model.addAttribute("accountDetails", new AccountDetails());
		return "accountDetails";
	}
	
	@PostMapping("/accountDetails")
    public String toAccountDetails(@Valid AccountDetails accountDetails, BindingResult binding) {
		if(binding.hasErrors()) {
			return "accountDetails";
		}
		customer.setAccountDetails(accountDetails);
		if(accountDetails.getHasNominee().equals("true"))
			return "redirect:/nomineeDetails";
		return "redirect:/confirmation";
    }
	
}
					