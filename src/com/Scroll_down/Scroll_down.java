package com.Scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		
	}

}
