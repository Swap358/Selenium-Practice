package com.MouseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// click on different buutoons like right clik and double click and simple click 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement dbClick=driver.findElement(By.id("doubleClickBtn"));
		WebElement btn1=driver.findElement(By.id("rightClickBtn"));
//		WebElement btn2=driver.findElement(By.id("bxpT3"));
		Actions action=new Actions(driver);
		
		action.doubleClick(dbClick).perform();
		
		Thread.sleep(2000);
		
		action.contextClick(btn1).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
	}

}