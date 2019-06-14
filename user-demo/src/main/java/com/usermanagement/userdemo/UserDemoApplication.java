package com.usermanagement.userdemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.usermanagement.userdemo.entities.Users;

@SpringBootApplication
public class UserDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(UserDemoApplication.class, args);
	}
	

}
