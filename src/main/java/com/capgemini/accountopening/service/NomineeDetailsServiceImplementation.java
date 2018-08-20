package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.accountopening.model.NomineeDetails;
import com.capgemini.accountopening.repository.NomineeDetailsRepository;

public class NomineeDetailsServiceImplementation implements NomineeDetailsService{

	@Autowired
	NomineeDetailsRepository nomineeDetailsRepo;
	
	@Override
	public void saveNomineeDetails(NomineeDetails nomineeDetails) {
		nomineeDetailsRepo.save(nomineeDetails);
	}

	@Override
	public NomineeDetails getNomineeDetailsById(long id) {
		return nomineeDetailsRepo.getOne(id);
	}
	
}
