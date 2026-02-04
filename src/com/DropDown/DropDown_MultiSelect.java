package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement ide =driver.findElement(By.id("ide"));
		Select ideName=new Select(ide);
		
		List<WebElement> ideNameOptions= ideName.getOptions();
		int option=ideNameOptions.size();
		System.out.println(option);
		
		
		for(int i=0 ;i<ideNameOptions.size();i++) {
			System.out.println(ideNameOptions.get(i).getText());
			
		}
	 System.out.println("using modern For loop");
	 
	 for(WebElement op:ideNameOptions) {
		 System.out.println(op.getText());
	 }
	 
	 
	 ideName.selectByIndex(2);
	 System.out.println(ideName.getFirstSelectedOption().getText());
	 Thread.sleep(3000);
	 ideName.selectByValue("nb");
	 Thread.sleep(3000);
	 
	 ideName.selectByVisibleText("Eclipse");
	 System.out.println(" after select Eclipse: "+ideName.getFirstSelectedOption().getText());
	 
	 List<WebElement> ideNameCount =ideName.getAllSelectedOptions();
	System.out.println("size :" +ideNameCount.size());
	 
	 for(WebElement op :ideNameCount) {
		 System.out.println(op.getText());
//		ideName.deselectByIndex(0);
//		ideName.deselectByValue("nb");
		Thread.sleep(3000);
		ideName.deselectAll();
	 }
	 
	}

}
