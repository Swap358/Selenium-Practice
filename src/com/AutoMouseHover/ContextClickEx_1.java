package com.AutoMouseHover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContextClickEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
	}

}
