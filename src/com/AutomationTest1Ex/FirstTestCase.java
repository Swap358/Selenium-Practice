package com.AutomationTest1Ex;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/*
 Test case 
 - launch the browser chorme
 - open demo URl 
 - validate title should be right url 
 -close the browser  
  */
public class FirstTestCase {

	public static void main(String[] args) {
		// first launch the browser 
		// create object or ChromeDriver 
		String expectd="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals(expectd)) {
			System.out.println("test_case 01 is pass");
		}else {System.out.println("Test Case is failed..");}
		
		driver.close();
	}
	
}
