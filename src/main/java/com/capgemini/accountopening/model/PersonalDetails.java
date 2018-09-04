package com.capgemini.accountopening.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="c_personal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	private Long id;
	
	@Column(name="fname")
	@Size(min=2, max=20, message="Must be between 2-20 characters")
	private String firstName;
	
	@Column(name="lname")
	@Size(min=2, max=20, message="Must be between 2-20 characters")
	private String lastName;
	
	@Column(name="mname")
	@Size(min=0, max=20, message="Must be less than 20 characters")
	private String middleName;
	
	@Column(name="suffix")
	private String suffix;
	
	@Column(name="ssn")
	@Pattern(regexp="^(?!219099999|078051120)(?!666|000|9\\d{2})\\d{3}(?!00)\\d{2}(?!0{4})\\d{4}$", message="Invalid SSN")
	private String ssn;
	
	@Column(name="dob")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message="Field cannot be empty")
	@Past(message="Invalid Date")
	private Date dob;
	
	@Column(name="maiden")
	@Size(min=2, max=20, message="Must be between 2-20 characters")
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
		return "PersonalDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", suffix=" + suffix + ", ssn=" + ssn + ", dob=" + dob + ", motherMName=" + motherMName
				+ "]";
	}
	

	
}
