package com.capgemini.accountopening.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="c_account")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="acc_number")
	private Long acc_number;
	
	@Column(name="customer_id")
	private Long customer_id;
	
	@Column(name="balance")
	private int balance;
	
	@Column(name="acc_type")
	private String acc_type;
	
	public Long getAcc_Number() {
		return acc_number;
	}

	public void setAcc_Number(Long acc_number) {
		this.acc_number = acc_number;
	}

	public Long getCustomer_Id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public int getBalance() {
		return balance;
	}

	public void setAddress1(int balance) {
		this.balance = balance;
	}

	public String getAcc_Type() {
		return acc_type;
	}

	public void setAcc_Type(String acc_type) {
		this.acc_type = acc_type;
	}

}