package com.usermanagement.userdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.usermanagement.userdemo.entities.Users;

@Component
public class DBSeeder implements CommandLineRunner {
	
	
	@Autowired
	private UserDao userDao;


	@Override
	public void run(String... args) throws Exception {
		Users user = getUser();
		userDao.save(user);
	}
	
	private Users getUser() {
		Users user= new  Users();
		user.setName("Ryan");
		user.setPassword("pass123");
		return user;
	}
	
	
}
