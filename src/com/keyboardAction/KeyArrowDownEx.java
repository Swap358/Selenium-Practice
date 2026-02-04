package com.keyboardAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyArrowDownEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
	
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_LEFT).perform();
		
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_RIGHT).perform();
		
		
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.BACK_SPACE).perform();
		action.sendKeys(Keys.ALT).perform();
		
		//like that all the keys you can check 
		
		
	}

}
