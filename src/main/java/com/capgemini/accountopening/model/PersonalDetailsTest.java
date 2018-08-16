package com.capgemini.accountopening.model;

import java.sql.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PersonalDetailsTest {
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String suffix;	
	private int ssn;
	private Date dob;
	private String motherMName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
		return "PersonalDetailsTest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", suffix=" + suffix + ", ssn=" + ssn + ", dob=" + dob + ", motherMName=" + motherMName
				+ "]";
	}
	
}
