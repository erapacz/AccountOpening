package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.NomineeDetails;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

@Controller
public class NomineeDetailsController {

	@RequestMapping(value="/nomineeDetails", method=RequestMethod.GET)
    public String NomineeerForm(Model model) {
        model.addAttribute("nominee", new NomineeDetails());
        return "nomineeDetails";
    }
	
	@RequestMapping(value="/nomineeDetails", method=RequestMethod.POST)
	public String toNomineePersonal(Model model) {
		return "nomineeDetails";
	}
	
}

