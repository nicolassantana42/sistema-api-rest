package com.nicolasprojectweb.userdpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolasprojectweb.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
