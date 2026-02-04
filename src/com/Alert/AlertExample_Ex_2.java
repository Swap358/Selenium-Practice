package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample_Ex_2 {

	public static void main(String[] args) throws InterruptedException {
		//Alert handling in Selenium.
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement alert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement alertMsg=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

		alert.click();
		
		Alert al=driver.switchTo().alert();
		System.out.println("alert Text:"+al.getText());
		
		al.accept();
		
		Thread.sleep(3000);
		alertMsg.click();
		Alert al2=driver.switchTo().alert();
		System.out.println("prompt text :"+al2.getText());
//		WebElement alertInput=driver.findElement(By.id(null))
		al2.sendKeys("I am Swapnil ");
		Thread.sleep(3000);
		al2.accept();
		
		

	}

}
	