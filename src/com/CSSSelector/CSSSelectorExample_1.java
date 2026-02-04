package com.CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// Tagname#id
		
	WebElement userName=	driver.findElement(By.cssSelector("input#email"));
	userName.sendKeys("Swapnil123");
	
	//tagname.ClassName
	
	WebElement user=driver.findElement(By.cssSelector("input.inputtext"));
	user.sendKeys("SwapnilRRr");
	}
	
	//tagname[attribute='value']
//	WebElement password=driver.findElement(By.cssSelector("input.inputtext"));
//	user.sendKeys("SwapnilRRr");
	
}
