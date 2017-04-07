package org.demo.salestool;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
	public void simpleTestPass() {
               int a = 1;
               int b = 2;
               assertTrue(a + b == 3);
		
	}
	
	@Test
	public void simpleTestFail() {
               int a = 2;
               int b = 2;
               assertTrue(a + b == 4);
		
	}
}
