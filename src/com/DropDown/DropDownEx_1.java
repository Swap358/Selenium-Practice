package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement course=driver.findElement(By.id("course"));
		
		Select couresName=new Select(course);
		
		List<WebElement> CourseNameOptions=couresName.getOptions();
		int option=CourseNameOptions.size();
		System.out.println(option);
		
		for(int i=0;i<CourseNameOptions.size();i++) {
			System.out.println(CourseNameOptions.get(i).getText());
		}
		
		System.out.println("--------------------------");
		
		for(WebElement op:CourseNameOptions) {
				System.out.println(op.getText());
		}
		
		
		couresName.selectByIndex(1);
		Thread.sleep(3000);
		couresName.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		
		couresName.selectByValue("js");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		WebElement options = couresName.getFirstSelectedOption();
		System.out.println(options.getText());
		
		List <WebElement> option1=couresName.getAllSelectedOptions();
		for(WebElement op:option1) {
			System.out.println(op.getText());
		}
		
		couresName.deselectByIndex(1);
		
		
	}
		
}