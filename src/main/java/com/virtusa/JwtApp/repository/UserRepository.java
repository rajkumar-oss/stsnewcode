package com.virtusa.JwtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.JwtApp.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


	User findByUserName(String username);


}
