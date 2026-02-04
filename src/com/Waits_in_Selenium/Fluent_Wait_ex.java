package com.Waits_in_Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fluent wait -
		//It is a advace Explicit Wait that allows selenium to define  maximun wait time , polling frequency , and ignoreExceptions 
		
		
		WebDriver driver= new ChromeDriver();
		
		try {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			// Fluent Wait Declarations
			Wait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			//wait untile login butto is clickable 
			WebElement logBtn =wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
			
			
			logBtn.click();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
