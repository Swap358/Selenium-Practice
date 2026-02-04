package com.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling_Ex_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Frame Handling 
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frameProperty =driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameProperty);
		
		WebElement drag =driver.findElement(By.id("draggable"));
		System.out.println(drag.getText());
		
		WebElement drop =driver.findElement(By.id("droppable"));
		System.out.println(drop.getText());
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
			WebElement resizable=driver.findElement(By.linkText("Resizable"));
			resizable.click();
		
	}

}
