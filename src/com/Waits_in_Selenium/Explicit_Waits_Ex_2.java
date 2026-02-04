package com.Waits_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waits_Ex_2 {

	public static void main(String[] args) {
		//ExplicitWait - it is conditional wait  that tells Selenium to wait for a specific 
		// condition for a particular element before preforming an action . 
		// it is smart and flexible 
		//
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement username = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))
		        );
			username.sendKeys("standard_user");

	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       	        
 
	        WebElement LoginBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
	        LoginBtn.click()	;

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
