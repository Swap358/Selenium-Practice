package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Priotaritization_Ex1 {
	
	
	// in testNG we can prioritize each test with asper condition 
	// data prioritization is possible.
	
	@Test(priority = 2)
	public void UpdateEmployee() {
		System.out.println("Employee Updated");
	}
	@Test (priority = 1)
	public void addEmployee() {
		System.out.println("Employee add");
	}
	
	@Test (priority = 4)
	public void deleteEmployee() {
		System.out.println("Employee deleted");
	}
	
	@Test(priority = 3)
	public void selectEmployee() {
		System.out.println("Employee selected");
	}
	@Test (priority = 5)
	public void insertEmployee() {
		System.out.println("Employee inserted");
	}
	
}
