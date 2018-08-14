package com.capgemini.accountopening.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.AccountDetails;
import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.model.Nominee;
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
	
	@RequestMapping(value="/contactdetails", method=RequestMethod.GET)
    public String contactdetailserForm(Model model) {
        model.addAttribute("contactdetails", new ContactDetails());
        return "contactdetails";
    }
	
	@RequestMapping(value="/contactdetails", method=RequestMethod.POST)
    public String toContactDetails(Model model) {
        return "contactdetails";
    }
	
	@RequestMapping(value="/accountType", method=RequestMethod.GET)
	public String accountTypeForm(Model model) {
		model.addAttribute("accountType", new AccountDetails());
		return "accountType";
	}
	
	@RequestMapping(value="/accountType", method=RequestMethod.POST)
	public String toAccountType(Model model) {
		return "accountType";
	}
 
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