package com.Scroll_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)", "");   // for scroll down 
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1000)", ""); // scroll UP 
		
		//Scroll down until the web page.
		Thread.sleep(2000);
		
		// scroll by means scroll to the spefic element 
		WebElement contextProp=driver.findElement(By.linkText("Context Menu"));
		js.executeScript("arguments[0].scrollIntoView(true);",contextProp);
		
		Thread.sleep(2000);
		
		
		// this is use to scroll directly bottom 
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
	}

}
