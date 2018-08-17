package com.capgemini.accountopening.service;

import com.capgemini.accountopening.model.PersonalDetails;

public interface PersonalDetailsService {
 void savePersonalDetails(PersonalDetails personaldetails);
 PersonalDetails getPersonalDetails();
}

