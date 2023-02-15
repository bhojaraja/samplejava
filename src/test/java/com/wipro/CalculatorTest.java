package com.wipro;

import junit.framework.TestCase;


public class CalculatorTest extends TestCase{

	public void testadd()
	{
		Calculator c=new Calculator();
		int result=c.add(10, 20);
		assertEquals(34,result);
	}
	public void testadd2()
	{
		Calculator c=new Calculator();
		int result=c.add(-100, 20);
		assertEquals(-80,result);
	}
	
}
