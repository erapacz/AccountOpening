package com.capgemini.accountopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountopening.model.ContactDetails;
import com.capgemini.accountopening.repository.ContactDetailsRepository;

@Service
public interface ContactDetailsService {
	
	public void saveContactDetails(ContactDetails contactDetails);
	
	public ContactDetails getContactDetailsById(long id);
	
	@Service
	static class ContactDetailsServiceImplementation implements ContactDetailsService{

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
	
}
