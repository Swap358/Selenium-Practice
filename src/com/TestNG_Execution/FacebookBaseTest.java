package com.TestNG_Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FacebookBaseTest {

	public static WebDriver driver;
	String url="https://www.facebook.com/";
	
	@BeforeMethod
	public void applicationLaunch() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void applicationClose() {
//		driver.close();
	}
}
