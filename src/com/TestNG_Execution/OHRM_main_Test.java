package com.TestNG_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRM_main_Test extends OHRMbaseTest {
	
	@Test
	public void OHRMTest(){
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("student");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Password123");
	System.out.println("Valid Login Test - " + Thread.currentThread().getId());
	driver.findElement(By.id("submit")).click();
	}
}