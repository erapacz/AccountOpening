package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, String>{

}
