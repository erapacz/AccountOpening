package com.capgemini.accountopening.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FinalPageController {
		
	@RequestMapping(value="/final/{accNum}", method=RequestMethod.GET)
    public String getFinal() {
        return "final";
    }
	
	@RequestMapping(value="/final", method=RequestMethod.POST)
	public String toConfimation(Model model) {
		return "final";
	}

}