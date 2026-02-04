package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	//Locators 
		//id - use for address web element and it is unique value in web page.
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("email")).sendKeys("Swapnil");
		
		
		//Method 2 - this is second method to find element of using webElement object 
		
			WebElement userName =driver.findElement(By.id("email"));
			userName.sendKeys("Raje");
			
			WebElement password= driver.findElement(By.id("pass"));
			password.sendKeys("raje124@");
	
			//locator by name - use it for handle text box there mention name = "value "
			driver.findElement(By.name("login")).click();
			
	
//	driver.quit();


	}

}
