package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("username"));
		boolean displayed=userName.isDisplayed();
		System.out.println(displayed);
		
		WebElement pass =driver.findElement(By.id("password"));
		boolean enabled=pass.isDisplayed();
		System.out.println(enabled);
		
		//enabled or not 
		
	}

}
