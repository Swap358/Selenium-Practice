package com.keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement userName =driver.findElement(By.id("userName"));
		userName.sendKeys("Swaonil");
		
		WebElement email =driver.findElement(By.id("userEmail"));
		userName.sendKeys("Swaonil@gmail.com");

		WebElement currentAddress =driver.findElement(By.id("currentAddress"));
		userName.sendKeys("Manmad");
		
		Actions action =new Actions(driver);
		
		action .keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		
		
		
	}	

}
