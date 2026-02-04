package com.multipleWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsAndTab {
	
	// there are some methods to use  handles window operation 
	// like as follws 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		String parentWindow1 = driver.getWindowHandle();  // using it get the window id it is unique 
		
		System.out.println(parentWindow1);				// print the window id 
		
		driver.findElement(By.linkText("Help")).click();
		String parentWindow2 =driver.getWindowHandle();
		System.out.println("2nd window"+parentWindow2	); // now contorl is in the 2nd object of window 
		
		
		// get child windows 
		Set<String> childWindows=driver.getWindowHandles();   // return the Set of child tabs in window
		System.out.println(childWindows);  					// print the set of tab  id  in window 
		
		// if want to swith between tab then 
		// way one convert SET to List 
		
		List<String> WindowList = new ArrayList<>(childWindows);
		System.out.println("List Array : "+WindowList);
		String Tab1 =WindowList.get(0);
		System.out.println("Tab 1 ID :"+Tab1);
		String Tab2 =WindowList.get(1);
		System.out.println("Tab 1 ID :"+Tab2);
		
		
		// now try the swtich to tab and print he titile 
		System.out.println(driver.getTitle());
		driver.switchTo().window(Tab2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Tab1);
		System.out.println(driver.getTitle());
		
		
		//Way  2nd  By For Each loop 
		System.out.println("using ForEach Loop ");
		for(String windowid:WindowList) {
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Google Account Help"))
				driver.close();
		}
		
		
		
		
	}

}
