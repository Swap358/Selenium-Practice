package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotation {

	
	/// this hirerachy of the annotation how executed 
	// so first suite -> test ->class --> method ->test case <-method <-class <-test <- suite is close 
	
	@Test
	public void test() {
		System.out.println("This is the test case !");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is executed before every method   ");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is executed after the every method.");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is executed before every class.");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is executed after every class");

}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is executed before every test ");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is executed after every test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is executed Before every suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is executed after every suite");
	}
	
}
