package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.NomineeDetails;

public interface NomineeDetailsRepository extends JpaRepository<NomineeDetails, Long> {

}
