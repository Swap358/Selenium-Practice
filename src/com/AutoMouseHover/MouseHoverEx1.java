package com.AutoMouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverEx1 {

	public static void main(String[] args) {
		//mouse hover is use to check the UI hover Effects on Webelement is working or not 
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://qabrains.com/practice-site?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
				Actions actions =new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//WebElement menu=driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div[1]/div/button"));
		
		// Hover menu (use better locator if possible)
        WebElement menu = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/div[1]/div/button"));
        actions.moveToElement(menu).perform();
		
		
		
        WebElement subLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"navbar-nav\"]/div[1]/div/div/div/a[1]"))
        );

        subLink.click();
		
		

	}

}
