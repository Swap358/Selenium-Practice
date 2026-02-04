package com.keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyHandling_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// this example shows how to copy and past the address from one text box to another text box .
		WebDriver driver=new ChromeDriver();
		String url="https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)","");
		WebElement username=driver.findElement(By.id("userName"));
		username.sendKeys("Swapnil");
		WebElement email =driver.findElement(By.id("userEmail"));
		email.sendKeys("Swapnil@gmail.com");
		WebElement address=driver.findElement(By.id("currentAddress"));
		address.sendKeys("MAnmad");

	
		Actions action =new  Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		
		WebElement permanantAddress=driver.findElement(By.id("permanentAddress"));
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
	
		
	}

}
