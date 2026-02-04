package com.Scroll_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement slider=driver.findElement(By.cssSelector("input[type='range'"));
		slider.sendKeys("80");
		Thread.sleep(2000);
		
		  js.executeScript("window.scrollBy(500,0)");

	}

}
