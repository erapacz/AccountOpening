package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.PersonalDetails;
import com.capgemini.accountopening.repository.PersonalDetailsRepository;

@Service("personalService")
public class PersonalDetailsServiceImplementation implements PersonalDetailsService{

	@Autowired
	PersonalDetailsRepository personalDetailsRepo;
	
	@Override
	public PersonalDetails savePersonalDetails(PersonalDetails personalDetails) {
		return personalDetailsRepo.save(personalDetails);
	}

	@Override
	public PersonalDetails getPersonalDetailsById(long id) {
		return personalDetailsRepo.getOne(id);
	}
	
}
