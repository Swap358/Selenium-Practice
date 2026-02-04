package com.RadioButtonsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsEx_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement
		tableProperty=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>group1Elements=tableProperty.findElements(By.name("group1"));
		 int links=group1Elements.size();
		 System.out.println(links);
		
		 System.out.println(group1Elements.size());
		
		for(int i=0;i<group1Elements.size();i++)
		{
		group1Elements.get(i).click();

			Thread.sleep(5000);
			for(int j=0;j<group1Elements.size();j++)

			{
				String elements=group1Elements.get(j).getAttribute("value")+" "+group1Elements.get(j).getAttribute("checked");
				System.out.println(elements);
			}
		}
	}

}
