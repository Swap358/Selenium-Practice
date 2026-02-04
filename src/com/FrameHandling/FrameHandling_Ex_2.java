package com.FrameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling_Ex_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Frame Handling 
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		//step 1 : identify the frames by tagname
		List <WebElement> frames =driver.findElements(By.tagName("frame"));
		//step 2: print the number of frames .
		
		System.out.println(frames.size());
		
		for(WebElement frame:frames) {
			String frameName =frame.getAttribute("name");
			System.out.println("frame name :"+frameName);
		}
		driver.switchTo().frame("frame-top");
		System.out.println("frame is switched");
		List <WebElement> subFrame =driver.findElements(By.tagName("frame"));
		System.out.println("sub Frame size :"+subFrame.size());
		
		for(WebElement subF: subFrame) {
			String subframe=subF.getAttribute("name");
			System.out.println("frame Name:" +subframe);
		}
		
		
		
	}

}
