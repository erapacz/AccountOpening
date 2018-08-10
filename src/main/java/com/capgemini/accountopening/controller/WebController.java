package com.capgemini.accountopening.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.PersonalDetails;

@Controller
public class WebController {
	
	List<PersonalDetails> personalDetails = new ArrayList<PersonalDetails>();

	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
    public String save(Model model) {
        return "index";
    }
	
	@RequestMapping(value="/personalInfoForm", method=RequestMethod.GET)
    public String usererForm(Model model) {
        model.addAttribute("user", new PersonalDetails());
        return "personalInfoForm";
    }

}