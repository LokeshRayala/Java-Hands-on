package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

private Login login;
	
	@Before
	public void setup() {
		login= new Login();
		System.out.println("Login Initiated");
	}
	
	@After
	public void tearDown() {
		login=null;
		System.out.println("Login Closed");
	}
	@Test
	public void bothCorrect() {
		 assertEquals(true,login.auth("Lokesh","user123"));
	}
	
	@Test
	public void WrongUsername() {
		 assertEquals(false,login.auth("admin","user123"));
		
	}
	
	@Test
	public void WrongPassword() {
		 assertEquals(false,login.auth("Lokesh","password"));
	}
	
	@Test 
	public void bothWrong() {
		 assertEquals(false,login.auth("me","pass"));
	}


}
