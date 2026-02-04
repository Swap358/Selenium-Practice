package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfElement {

	public static void main(String[] args) {

			// check visibility of Element using follwong 3 methods 
			// isEnabled() , isDisplayed() ,isSelected() 
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("username"));
		
		boolean user =userName.isDisplayed();
		
		
		System.out.println("Username input box is :"+ user );

		userName.sendKeys("Swapnil");
		
		
		WebElement password =driver.findElement(By.id("password"));
		
		boolean pass =password.isEnabled();
	
		System.out.println("Password input is :"+pass);
		
		password.sendKeys("Swapnil@9p94");
		WebElement remember =driver.findElement(By.id("rememberUn"));
		boolean selected =remember.isSelected();
		
		System.out.println("remember checkbox is :"+ selected);
		
		remember.click();
		
		
		selected =remember.isSelected();
		System.out.println("remember checkbox after click() use  is :"+ selected);
	}

}
