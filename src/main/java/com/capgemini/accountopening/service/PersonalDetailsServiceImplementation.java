package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

public class PersonalDetailsServiceImplementation implements PersonalDetailsService{

	@Autowired
	PersonalDetailsRepository personalDetailsRepo;
	
	@Override
	public void savePersonalDetails(PersonalDetails personalDetails) {
		personalDetailsRepo.save(personalDetails);
	}

	@Override
	public PersonalDetails getPersonalDetailsById(long id) {
		return personalDetailsRepo.getOne(id);
	}
	
}
