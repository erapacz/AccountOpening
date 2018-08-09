package com.capgemini.accountopening.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.User;
import com.capgemini.accountopening.repository.UserRepository;

@Controller
public class WebController {
	
	List<User> users = new ArrayList<User>();
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }
	
	@RequestMapping(value="/personalInfoForm", method=RequestMethod.GET)
    public String usererForm(Model model) {
        model.addAttribute("user", new User());
        return "personalInfoForm";
    }
 
    @RequestMapping(value="/personalInfoForm", method=RequestMethod.POST)
    public String usererSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        userRepo.save(user);
        return null;
    }

}