	package com.CSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SelectorExample {

	
	public static void main(String[] args) {
		
		// there are 3 type of selector 
		//1) Tag#id -> Tagname#idValue   
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
					
			driver.manage().window().maximize();
			WebElement userName =driver.findElement(By.cssSelector("input#email"));  // here use tagName#value
			userName.sendKeys("swapnil ");
			
			WebElement userName2 = driver.findElement(By.cssSelector("input.inputtext")); // we use tagName.ClassName
			userName2.sendKeys("swapnil ");
			
			
			//now use Tag[attribute=’value’] →Tagname[attribute=’value’]
			WebElement userName3 = driver.findElement(By.cssSelector("input[placeholder='Password']")); // we use tagName.ClassName
			userName3.sendKeys("swapnil ");
			
			
			WebElement login = driver.findElement(
				    By.cssSelector("button[name='login']")
				);
				login.click();
		
	}
}
