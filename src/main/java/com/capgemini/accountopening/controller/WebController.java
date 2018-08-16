package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.ContactDetails;

import com.capgemini.accountopening.model.Nominee;

import com.capgemini.accountopening.model.Customer;

import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.AccountDetailsRepository;
import com.capgemini.accountopening.repository.ContactDetailsRepository;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

@Controller
public class WebController {
	
	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	
	@Autowired
	private ContactDetailsRepository contactDetailsRepository;
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
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
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.GET)
    public String getContactDetailsForm(Model model) {
        model.addAttribute("contactDetails", new ContactDetails());
        return "contactDetails";
    }
	
	@RequestMapping(value="/contactDetails", method=RequestMethod.POST)
    public String toContactDetails(Model model) {
        return "contactDetails";
    }
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.GET)
	public String getAccountDetailsForm(Model model) {
		model.addAttribute("accountDetails", new AccountDetails());
		return "accountDetails";
	}
	
	@RequestMapping(value="/accountDetails", method=RequestMethod.POST)
    public String toAccountDetails(Model model) {
		return "accountDetails";
    }
 
	@RequestMapping(value="/nomineeDetails", method=RequestMethod.GET)
    public String NomineeerForm(Model model) {
        model.addAttribute("nominee", new Nominee());
        return "nomineeDetails";
    }
	
	@RequestMapping(value="/nomineeDetails", method=RequestMethod.POST)
	public String toNomineePersonal(Model model) {
		return "nomineeDetails";
	}
	
	@RequestMapping(value="/confirmation", method=RequestMethod.GET)
    public String confimationForm(Model model) {
        model.addAttribute("nominee", new Nominee());
        return "confirmation";
    }
	
	@RequestMapping(value="/confirmation", method=RequestMethod.POST)
	public String toConfimation(Model model) {
		return "confirmation";
	}

}