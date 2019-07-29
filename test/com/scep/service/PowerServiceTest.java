package com.scep.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerServiceTest {

	// to test the positive scenario
	@Test
	public void verifyOuput() {
		Service ps = new PowerService();
		Double output = ps.power(2, 3);
		assertTrue(output == 8.0);
	}

	// to test the power of negative number
	@Test
	public void verifyNegativeInput() {
		Service ps = new PowerService();
		Double output = ps.power(2, -3);
		assertTrue(output == 0.125);
	}

	// to test the power of zero number
	@Test
	public void verifyZeroXInput() {
		Service ps = new PowerService();
		Double output = ps.power(0, 2);
		assertTrue(output == 0.0);
	}

	// to test zero power of zero
	@Test
	public void verifyZeroPowerOfZero() {
		Service ps = new PowerService();
		Double output = ps.power(0, 0);
		assertTrue(output == 1.0);
	}

	// to test odd power of negative number
	@Test
	public void verifyOddPowerOfNegativeNumber() {
		Service ps = new PowerService();
		Double output = ps.power(-2, 3);
		assertTrue(output == -8.0);
	}

	// to test even power of negative number
	@Test
	public void verifyEvenPowerOfNegativeNumber() {
		Service ps = new PowerService();
		Double output = ps.power(-2, 4);
		assertTrue(output == 16.0);
	}

}