package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

public class ContactDetailsServiceImplementation implements ContactDetailsService{

	@Autowired
	ContactDetailsRepository contactDetailsRepo;
	
	@Override
	public void saveContactDetails(ContactDetails contactDetails) {
		contactDetailsRepo.save(contactDetails);
	}

	@Override
	public ContactDetails getContactDetailsById(long id) {
		return contactDetailsRepo.getOne(id);
	}
	
}
