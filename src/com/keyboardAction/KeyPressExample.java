package com.keyboardAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_press");
		
		driver.manage().window().maximize();
		
		
		Actions  action= new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		
	}

}
