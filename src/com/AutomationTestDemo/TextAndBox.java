package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAndBox {
	
	
//	Working with Text and Box Example
	//getAttribute( )- use For retrive value of specific attribute of web element
	// and getText( ) - use for retirve the visible text of the web element 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("Swapnil");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("234324sdfsdf");
		
		
		System.out.println(" Retrive value using the getAttribute()   - value= ");
		String user=userName.getAttribute("value");
		System.out.println(user);
		
		String pas=pass.getAttribute("value");
		System.out.println(pas);
		
		
		
		System.out.println(" Retrive value using the getText()   -");
		
		WebElement forgot =driver.findElement(By.linkText("Forgotten password?"));
		String forgetton =forgot.getText();
		System.out.println(forgetton);
		
		String f =forgot.getAttribute("href");
		System.out.println(f);
		
		
		String u=userName.getAttribute("type");
		System.out.println(u);
		
		String p=pass.getAttribute("id");
		System.out.println(p);
		
		if(u.equals(p)) {
			System.out.println("pass");
			
		}else {System.out.println("fails");}
		}

}
