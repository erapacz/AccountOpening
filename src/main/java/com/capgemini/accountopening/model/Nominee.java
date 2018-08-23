package com.capgemini.accountopening.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="nominee_id")
	private Long id;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="suffix")
	private String suffix;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="mothers_maiden_name")
	private String motherMName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId= customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMotherMName() {
		return motherMName;
	}

	public void setMotherMName(String motherMName) {
		this.motherMName = motherMName;
	}
	
	@Override
	public String toString() {
		return(this.firstName+" "+this.lastName+"\n"+this.ssn+" "+this.dob+"\n"+this.motherMName);
	}
}
