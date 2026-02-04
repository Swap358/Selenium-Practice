package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Edit box 
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("Swapnil@gmail.com");
		
		System.out.println(userName);
		
		
	}

}
