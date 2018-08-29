package com.capgemini.accountopening.service;

import com.capgemini.accountopening.model.NomineeDetails;

public interface NomineeDetailsService {
	
	NomineeDetails saveNomineeDetails(NomineeDetails nomineeDetails);
	
	NomineeDetails getNomineeDetailsById(long id);	
}