package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Enabled_Ex {
	
	@Test(enabled = false)
	public void UpdateEmployee() {
		System.out.println("Employee Updated");
	}
	@Test
	public void addEmployee() {
		System.out.println("Employee add");
	}
	
	@Test
	public void deleteEmployee() {
		System.out.println("Employee deleted");
	}
	
	@Test
	public void selectEmployee() {
		System.out.println("Employee selected");
	}
	@Test
	public void insertEmployee() {
		System.out.println("Employee inserted");
	}
	
}
