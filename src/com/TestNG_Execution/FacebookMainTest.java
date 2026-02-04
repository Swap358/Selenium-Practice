package com.TestNG_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FacebookMainTest extends FacebookBaseTest {
	
	@Test
	public void FacebookTest(){
	WebElement userName = driver.findElement(By.xpath( "//input[@id='email']"));
	userName.sendKeys("student");
	WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
	password.sendKeys("Password123");
	System.out.println("Valid Login Test - " + Thread.currentThread().getId());
//	driver.findElement(By.id("submit")).click();
	}
}