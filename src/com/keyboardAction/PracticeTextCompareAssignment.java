package com.keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTextCompareAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)","");
		WebElement text1 =driver.findElement(By.id("inputText1"));
		
		text1.sendKeys("Hello World");
		Thread.sleep(2000);
		
		Actions action =new Actions(driver);
			
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement text2 =driver.findElement(By.id("inputText2"));
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
//		driver.findElement(By.id("compareButtonSpinner")).click();
//		WebElement result= driver.findElement(By.className("messageForUser"));
//		System.out.println(result.getText());
//		
		
		
	}

}
