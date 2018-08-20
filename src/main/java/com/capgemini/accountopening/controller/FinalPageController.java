package com.capgemini.accountopening.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.accountopening.model.Customer;

@Controller
public class FinalPageController {
	
	@Autowired 
	private Customer customer;
		
	@RequestMapping(value="/final", method=RequestMethod.GET)
    public String confimationForm(HttpSession session) {
		String accNum = customer.getAccountDetails().getAccNumber();
		session.setAttribute("accNum",  accNum);
        return "final";
    }
	
	@RequestMapping(value="/final", method=RequestMethod.POST)
	public String toConfimation(Model model) {
		return "final";
	}

}