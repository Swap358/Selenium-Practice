package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationExample {

	//Validation an Application using EqualsIgnorecase() ,Equals() ,contains()   that all are java methods.
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String ExpectedTitle ="Facebook";
		System.out.println("Expected Title: "+ ExpectedTitle);
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail !");
		}
		
		System.out.println("Using the equals( methods)-");
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("pass ");
		}else {
			System.out.println("Fails !");
		}
		
		
		System.out.println("Using the contains() methods-");
		if(ExpectedTitle.contains(ActualTitle)) {
			System.out.println("pass ");
		}else {
			System.out.println("Fails !");
		}
		
//		driver.findElement(By.id(""))
	}
}
