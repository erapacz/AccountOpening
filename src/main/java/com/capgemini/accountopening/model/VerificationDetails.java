package com.capgemini.accountopening.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.capgemini.date.CustomDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class VerificationDetails implements Serializable{
	
	private String accNum;
	
	private Long customerId;
	
	private String maiden;
	
	private String ssn;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	@JsonDeserialize(using = CustomDateDeserializer.class)

	private Date dob;

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getMaiden() {
		return maiden;
	}

	public void setMaiden(String maiden) {
		this.maiden = maiden;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "VerificationDetails [accNum=" + accNum + ", maiden=" + maiden + ", ssn=" + ssn + ", dob=" + dob + "]";
	}
	
}
