package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.PersonalDetails;

public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {

}
