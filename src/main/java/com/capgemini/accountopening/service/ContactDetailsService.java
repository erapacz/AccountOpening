package com.capgemini.accountopening.service;

import com.capgemini.accountopening.model.ContactDetails;

public interface ContactDetailsService {
	
	public ContactDetails saveContactDetails(ContactDetails contactDetails);
	
	public ContactDetails getContactDetailsById(long id);
}
