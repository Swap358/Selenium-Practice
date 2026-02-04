package com.AutomationTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;


public class MouseHoverExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Mouse HOver 
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		System.out.println("page is loaded succesfully ");
		
		Thread.sleep(5000);
//		WebElement Link =driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
		WebElement sublink1 =driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/a[1]/div/div"));
		WebElement Link =   driver.findElement(By.xpath(""));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(Link).click(sublink1).build().perform();
		
		System.out.println("mouse is hover on the first link:");
		
		
		
		
	}	

}
