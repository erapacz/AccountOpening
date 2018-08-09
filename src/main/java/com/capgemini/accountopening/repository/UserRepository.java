package com.capgemini.accountopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.accountopening.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
