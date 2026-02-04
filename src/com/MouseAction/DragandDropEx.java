package com.MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/dragdrop/");
		driver.manage().window().maximize();
		
		WebElement firstElement =driver.findElement(By.id("one"));
		WebElement secondElement =driver.findElement(By.id("two"));
		WebElement thirdElement =driver.findElement(By.id("three"));
		WebElement fourthElement =driver.findElement(By.id("four"));
		WebElement fifthElement =driver.findElement(By.id("five"));
		
		
		WebElement target =driver.findElement(By.id("bin"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(firstElement, target).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(secondElement, target).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(thirdElement, target).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(fourthElement, target).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(fifthElement, target).build().perform();
		
	} 

}
