package com.capgemini.accountopening.service;

import com.capgemini.accountopening.model.PersonalDetails;

public interface PersonalDetailsService {
	
	public PersonalDetails savePersonalDetails(PersonalDetails personalDetails);
	
	public PersonalDetails getPersonalDetailsById(long id);
}

