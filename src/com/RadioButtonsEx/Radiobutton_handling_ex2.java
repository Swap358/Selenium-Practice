package com.RadioButtonsEx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_handling_ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.leafground.com/radio.xhtml");
	
	WebElement radioButtons = driver.findElement(By.xpath("//label[text()='Chrome']"));
	System.out.println("radio Text : "+radioButtons.getText());
	
	if(radioButtons.isEnabled()) {
		System.out.println("is Enable "+radioButtons.isEnabled());
		radioButtons.click();
		System.out.println(radioButtons.getText()+" radio clicked");
	}
	
	
	
	List<WebElement> radioButtons1 =driver.findElements(By.name("j_idt87:console1"));
	
	for(WebElement radio:radioButtons1) {
		System.out.println("Enter is For loop ");
		radio.click();
		Thread.sleep(1000);
		
		System.out.println(
				"Value:"+ radio.getAttribute("value")+
				"|Selected :"+ radio.isSelected());
	}

	
	

	}

}
