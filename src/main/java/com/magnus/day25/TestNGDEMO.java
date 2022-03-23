package com.magnus.day25;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDEMO {

	@BeforeTest
	public void Demo() {
		System.out.println("This is from Before Test");
	}

	@Test
	public void Demo2() {
		System.out.println("The is Demo2 method");
	}

	@AfterTest
	public void Demo3() {
		System.out.println("This is Demo 3 method");
	}

}
