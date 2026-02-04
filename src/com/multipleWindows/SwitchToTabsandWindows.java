package com.multipleWindows;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTabsandWindows {

	//performing swithch to new window and tab and opening new sites and perform on it.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		String parent=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com");
		
		
	}	

}
