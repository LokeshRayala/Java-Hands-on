package com.simplilearn.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.service.UserService;

@SpringBootTest(classes = SpringBootCrudApplication.class)
class SpringBootCrudApplicationTests {

	@Autowired
	 private UserService  service;
	@Disabled
	@Test
	void addUser() {
		User u= new User();
		u.setName("Lokesh");
		u.setDob("21-12-2001");
		u.setAddress("6-108/3,Main Bazar, Pune");
		u.setEmail("Lokesh@gmail.com");
		u.setMobile(987657890);
		u.setGender("Male");
		Assertions.assertNotNull(service.addUser(u));
	}
	
	@Test
	void getAll() {
		Assertions.assertEquals(2, service.getAllUser().size());
	}
	 

}
