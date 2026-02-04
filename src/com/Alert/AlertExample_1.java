package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample_1 {

	public static void main(String[] args) throws InterruptedException {
//		Alert box  / popup box is also use for warning purpose as well .
//		simple alert , confirmation alert, prompt alert. 
		
//		simple alert - ok 
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement alert =driver.findElement(By.id("alert2"));
		alert.click();
		Thread.sleep(1000);
		Alert alertMessage =driver.switchTo().alert();
		alertMessage.sendKeys("Swapnil is Jobless person.");
//		alertMessage.accept();   // this method is use to clickon ok button of alert box.
//		alertMessage.dismiss();  // this method is use to click on cancle button of alert box. 
		String textMsg =alertMessage.getText();
		
		System.out.println(textMsg);
		
		
		

	}

}
