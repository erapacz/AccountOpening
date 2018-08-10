package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {

}
