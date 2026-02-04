package com.RadioButtonsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsEx_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
//		WebElement radio = driver.findElement(By.id(""))
		WebElement radioBrowser=driver.findElement(By.xpath("//label[text()=\"Firefox\"]"));
			System.out.println(radioBrowser.getText());
		
		if(radioBrowser.isEnabled()) {
			System.out.println("is enable ");
			radioBrowser.click();
		}

		WebElement radio =driver.findElement(By.id("j_idt87:console1:1"));
		System.out.println("it is selected :"+radio.isSelected());
		
		
		List <WebElement> RadioButtons =driver.findElements(By.name("j_idt87:console1"));
		
		for(int i=0;i<RadioButtons.size();i++) {
			
			RadioButtons.get(i).click();
			Thread.sleep(5000);
			for(int j =0 ;j<RadioButtons.size();j++) {
				String elments =RadioButtons.get(j).getAttribute("value")+" "+RadioButtons.get(j).getAttribute("checked");
				System.out.println(elments);
			}
		}
		
		
//		WebElement
		
		
	
	}

}
