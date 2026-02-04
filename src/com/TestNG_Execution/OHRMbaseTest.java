package com.TestNG_Execution;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//this is the serial execution of the applicaotion 	 - means the many application is open and automate one bye one 
// and parallel execution is mean both or many application is open at a time 
public class OHRMbaseTest {

	public static WebDriver driver;
	String url="https://practicetestautomation.com/practice-test-login/";
	
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
