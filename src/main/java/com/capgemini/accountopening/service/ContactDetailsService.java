package com.capgemini.accountopening.service;

import java.util.Optional;

import com.capgemini.accountopening.model.ContactDetails;

public interface ContactDetailsService {
	
	public ContactDetails saveContactDetails(ContactDetails contactDetails);
	
	public ContactDetails getContactDetailsById(long id);
	
	public Optional<ContactDetails> findByCustomerId(long id);
}
