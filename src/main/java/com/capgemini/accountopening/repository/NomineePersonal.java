package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.PersonalDetails;

public interface NomineePersonal extends JpaRepository<PersonalDetails, Long> {

}
