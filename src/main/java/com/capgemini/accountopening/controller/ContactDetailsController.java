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

@Controller
public class ContactDetailsController implements WebMvcConfigurer {

	@Autowired
	private Customer customer;
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/accountDetails").setViewName("accountDetails");
    }
	
	@GetMapping("/contactDetails")
    public String showForm(Model model) {
		model.addAttribute("contactDetails", new ContactDetails());
		return "contactDetails";
    }
	
	@PostMapping("/contactDetails")
    public String checkContactDetails(@Valid ContactDetails contactDetails, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "contactDetails";
		}
		customer.setContactDetails(contactDetails);
        return "redirect:/accountDetails";
    }
}