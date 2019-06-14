package com.usermanagement.userdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.userdemo.entities.Users;


public interface UserDao extends JpaRepository<Users, Integer> {

}
