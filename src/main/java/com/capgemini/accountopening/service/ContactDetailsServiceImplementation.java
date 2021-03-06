package com.capgemini.accountopening.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

@Service("contactService")
public class ContactDetailsServiceImplementation implements ContactDetailsService{

	@Autowired
	ContactDetailsRepository contactDetailsRepo;
	
	@Override
	public ContactDetails saveContactDetails(ContactDetails contactDetails) {
		return contactDetailsRepo.save(contactDetails);
	}

	@Override
	public ContactDetails getContactDetailsById(long id) {
		return contactDetailsRepo.getOne(id);
	}
	
	@Override
	public Optional<ContactDetails> findByCustomerId(long id) {
		return contactDetailsRepo.findByCustomerId(id);
	}
	
}
