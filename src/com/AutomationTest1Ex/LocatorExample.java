package com.AutomationTest1Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) {
		//Use of Locators 
		
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		
		
		//by name meethod 
		
		wd.findElement(By.name("q")).sendKeys("Teddy bear");
		
		// by id 
		
		
		//link text and partial link text 
//		wd.findElement(By.linkText(""))
		
	}

}
