package com.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeFile {
	
	@Test
	@Parameters({"username","password"})
	public void loginTest(String user,String pass) {
			System.out.println("username "+user);
			System.out.println("password "+pass);
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	}
	

}
