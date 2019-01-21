package com.qa.clare.automatedTestBlackJack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qa.clare.automatedTestBlackJack.blackJack;

public class blackJackTest1 {
	
	blackJack myBlackJack;

	@Before
	public void createVariable() {
		myBlackJack = new blackJack();
	}
	
	
	@Test
	public void greaterThanTwentyOne() {
		//test to see if when w numbers are put in if over 21 should fail. 
		int a = 22;
		int b = 25;
	
		 assertEquals("Did not print out 0", 0 , myBlackJack.blackJackChecker(a,b));
	   
	}
	

	@Test
	public void aIsGreaterThanB() {
		//test to see if when w numbers are put in if over 21 should fail. 
		int a = 21;
		int b = 25;
	
		assertEquals("A should have been greater than B", 21 , myBlackJack.blackJackChecker(a,b));
	   
	}
	

	@Test
	public void bIsGreaterThanA() {
		//test to see if when w numbers are put in if over 21 should fail. 
		int a = 25;
		int b = 21;
	
		assertEquals("B should have been returned", 21 , myBlackJack.blackJackChecker(a,b));
	   
	}
	
	@Test
	public void bothNumbersAreZero() {
		//test to see if when w numbers are put in if over 21 should fail. 
		int a = 0;
		int b = 0;
	
		assertEquals("Should have returned 0", 0 , myBlackJack.blackJackChecker(a,b));
	   
	}
	
	
	
	@After
	public void resetVariables() {
		System.out.println("Test complete");
	}
	
}
