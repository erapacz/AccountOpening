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

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Customer;
import com.capgemini.accountopening.model.PersonalDetails;

@Controller
public class PersonalDetailsController implements WebMvcConfigurer {

	@Autowired
	private Customer customer;
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/contactDetails").setViewName("contactDetails");
    }
	
	@GetMapping("/personalDetails")
    public String showForm(Model model) {
		model.addAttribute("personalDetails", new PersonalDetails());
		return "personalDetails";
    }
	
	@PostMapping("/personalDetails")
    public String checkPersonalDetails(@Valid PersonalDetails personalDetails, Model model, BindingResult bindingResult){
		model.addAttribute("personalDetails", personalDetails);
		if(bindingResult.hasErrors()) {
			return "personalDetails";
		}
		customer.setPersonalDetails(personalDetails);
		//model.addAttribute("contactDetails", new ContactDetails());
        return "redirect:/contactDetails";
    }
	

	
}