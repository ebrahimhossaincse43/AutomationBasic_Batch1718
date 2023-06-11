package com.it.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("This is After Test");
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("This is After Method");
	}
	
	@Test(priority = 1)
	public void secondTest() {
		System.out.println("This is second Test");
	}
	
	@Test(priority = 0)
	public void firstTest() {
		System.out.println("This is first Test");
	}
}
