package com.screenshots;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// takes Full Web PAge screen shot 
		
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(".\\Screenshots\\facebookHomepage.png"));
		
		
		
		//Takes screenshot of a Section.
		
		WebElement fb=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]"));
		
		File sc =fb.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sc, new File(".\\Screenshots\\fbsection.png"));
		
		//takes screen shot of a element 
		
		WebElement fblogo =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));
		
		File s= fblogo.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(s, new File(".\\Screenshots\\fblogo.png"));
		System.out.println("screen shot is taken ");
	}

}
