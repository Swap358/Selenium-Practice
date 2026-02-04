package com.Log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Facebook WEbsite launch succes fully ");
		Logs.info("facebook applicaiton is launch successfully.");
		

	}

}
