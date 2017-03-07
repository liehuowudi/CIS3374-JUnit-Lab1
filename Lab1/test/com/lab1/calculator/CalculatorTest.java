package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4,calculator.add(2, 2));
	}
	
	// Exercise D 1,2,3
	
	@Test
	public void subtractTest(){
		assertEquals(0,calculator.subtract(2, 2));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(10,calculator.multiply(5, 2));
	}

	@Test
	public void divideTest(){
		assertEquals(1,calculator.divide(2, 2));
	}

	@Test
	public void isEqualTest1(){
		assertTrue(calculator.isEqual(2, 2));
	}

	@Test
	public void isEqualTest2(){
		assertFalse(calculator.isEqual(3, 2));
	}
// D/3 for the method isEqualTest2, I input 3 and 2 to 
// test the isEqual method run the test, it processed 
// successfully. If I input two number are the same,
// it would be error results.

}
