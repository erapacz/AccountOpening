package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.NomineeDetails;
import com.capgemini.accountopening.repository.NomineeDetailsRepository;

@Service("nomineeService")
public class NomineeDetailsServiceImplementation implements NomineeDetailsService{

	@Autowired
	NomineeDetailsRepository nomineeDetailsRepo;
	
	@Override
	public NomineeDetails saveNomineeDetails(NomineeDetails nomineeDetails) {
		return nomineeDetailsRepo.save(nomineeDetails);
	}

	@Override
	public NomineeDetails getNomineeDetailsById(long id) {
		return nomineeDetailsRepo.getOne(id);
	}
	
}
