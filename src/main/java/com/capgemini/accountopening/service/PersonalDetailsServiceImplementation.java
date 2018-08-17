package com.capgemini.accountopening.service;

import java.util.HashMap;

import com.capgemini.accountopening.model.PersonalDetails;

public class PersonalDetailsServiceImplementation implements PersonalDetailsService{

	private HashMap<Long, PersonalDetails> PersonalDetailsMap = new HashMap<>();
	@Override
	public void savePersonalDetails(PersonalDetails personaldetails) {
		int id = 0;
		//PersonalDetailsMap
	}

	@Override
	public PersonalDetails getPersonalDetails() {
		
		return null;
	}
	
}
