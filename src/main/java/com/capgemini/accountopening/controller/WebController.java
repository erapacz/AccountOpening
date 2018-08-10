package com.capgemini.accountopening.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

@Controller
public class WebController {
	
	List<PersonalDetails> personalDetails = new ArrayList<PersonalDetails>();
	
	@Autowired
	private PersonalDetailsRepository personalDetailsRepo;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }
	
	@RequestMapping(value="/personalInfoForm", method=RequestMethod.GET)
    public String usererForm(Model model) {
        model.addAttribute("user", new PersonalDetails());
        return "personalInfoForm";
    }
 
    @RequestMapping(value="/personalInfoForm", method=RequestMethod.POST)
    public String usererSubmit(@ModelAttribute PersonalDetails personalDetails, Model model) {
        model.addAttribute("user", personalDetails);
        personalDetailsRepo.save(personalDetails);
        return null;
    }

}