package com.sample;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	App app =  new App();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@Test
	public void testReturnA() {
		assertTrue("A".equals(app.returnA()));
	}

	@Test
	public void testReturnB() {
		assertTrue("returnB Fail", "B".equals(app.returnB()));
	}

	@Test
	public void testReturnC() {
		assertTrue("returnC Fail", "C".equals(app.returnC()));
	}

	@Test
	public void testReturnD() {
		assertTrue("returnD Fail", "D".equals(app.returnD()));
	}

	@Test
	public void testReturnE() {
		assertTrue("returnE Fail", "E".equals(app.returnE()));
	}

}
