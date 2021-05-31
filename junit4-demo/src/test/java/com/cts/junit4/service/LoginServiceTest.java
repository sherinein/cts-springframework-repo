package com.cts.junit4.service;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.junit4.dto.User;

public class LoginServiceTest {
	private User user;
	private LoginService service;
	@Before
	public void setUp() {
		service=new LoginService();
	
	}
	// positive test case
	@Test
	@Ignore
	public void testValidUser() {
		user=new User("Nirmala","Nirmala");
		assertTrue(service.validateUser(user));
	}
	
	//negative test case
	@Test
	@Ignore
	public void testInValidUser() {
		user=new User("Nirmala","Nirmala123");
		assertFalse(service.validateUser(user)); 
	}
	
	
	@Test
	public void testDoubleorFloat() {
		double expected=3.14d;
		double actual=3.14d;
		assertEquals(expected,actual,0.0001);
	}
	@Ignore
	@Test
	public void testFail() {
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testArithmeticException() {
		service.arithmeticCalculation();
	}
	
	@Test
	public void testtoCompareArray() {
		int expectedArray[]= {11,12,13,14};
		int actualArray[]= {12,13,14,11};
		
		//Sorting
		Arrays.sort(actualArray);
		assertArrayEquals(expectedArray,actualArray);
		
	}
	
	@After
	public void tearDown() {
		service=null;
	}
}
