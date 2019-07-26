package com.scep.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerServiceTest {

	@Test
	public void verifyOuput(){
		Service ps = new PowerService();
		Double output = ps.power(2, 3);
		assertTrue(output == 8.0);
	}
	
	@Test
	public void verifyNegativeInput(){
		Service ps = new PowerService();
		Double output = ps.power(2, -3);
		assertTrue(output == -0.125);
	}
	
	
}