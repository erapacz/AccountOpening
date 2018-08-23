package com.capgemini.accountopening.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="c_account")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AccountDetails {
	@Id
	@Column(name="acc_number")
	private String accNumber;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="balance")
	@Size(min=50, max=100000, message="Must deposit at least $50")
	private int balance;
	
	@Column(name="acc_type")
	private String accType;
	
	private String hasNominee;
	
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public int getBalance() {
		return balance;
	}

	public void setAddress1(int balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getHasNominee() {
		return hasNominee;
	}

	public void setHasNominee(String hasNominee) {
		this.hasNominee = hasNominee;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDetails [accNumber=" + accNumber + ", customerId=" + customerId + ", balance=" + balance
				+ ", accType=" + accType + "]";
	}
	
	

}