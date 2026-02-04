package com.MouseAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Rightclick using ContextClick
		// click right click and save , copy and delete option is click .
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button =driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver); 
		action.moveToElement(button).contextClick().build().perform();
		Thread.sleep(1000);
//		action.contextClick().click(button)
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		System.out.println("Text is Cpied");
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		Thread.sleep(3000);
		
		action.moveToElement(button).contextClick().build().perform();
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		System.out.println("Text is Pasted");
		Thread.sleep(1000);
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		Thread.sleep(3000);
		
		action.moveToElement(button).contextClick().build().perform();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println("Text is deleted");
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		Thread.sleep(3000);
		
		
	}

}
