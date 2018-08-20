package com.capgemini.accountopening.model;

import javax.annotation.ManagedBean;

@ManagedBean
public class Customer {
		
	private PersonalDetails personalDetails;
	private ContactDetails contactDetails;
	private AccountDetails accountDetails;
	private NomineeDetails nomineeDetails;
	
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	public NomineeDetails getNomineeDetails() {
		return nomineeDetails;
	}
	public void setNomineeDetails(NomineeDetails nomineeDetails) {
		this.nomineeDetails = nomineeDetails;
	}
	
	
	
}
