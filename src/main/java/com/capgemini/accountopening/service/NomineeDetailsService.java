package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.NomineeDetails;
import com.capgemini.accountopening.repository.NomineeDetailsRepository;

@Service
public interface NomineeDetailsService {
	
	public void saveNomineeDetails(NomineeDetails nomineeDetails);
	
	public NomineeDetails getNomineeDetailsById(long id);
	
	@Service
	static class NomineeDetailsServiceImplementation implements NomineeDetailsService{

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
	
}