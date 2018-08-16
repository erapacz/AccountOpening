package com.capgemini.accountopening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Nominee;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

@Controller
public class NomineeDetailsController {

	@RequestMapping(value="/nominee_personal", method=RequestMethod.GET)
    public String NomineeerForm(Model model) {
        model.addAttribute("nominee", new Nominee());
        return "nominee_personal";
    }
	
	@RequestMapping(value="/nominee_personal", method=RequestMethod.POST)
	public String toNomineePersonal(Model model) {
		return "nominee_personal";
	}
	
}
