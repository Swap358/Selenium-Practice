package com.AutomationTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		WebDriver driver=new ChromeDriver();
		
		
		//get ()
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
		//	 System.out.println(dr.getPageSource());  //it is use to get source code of the page 
		
		System.out.println(driver.getTitle());     // it is use to get title of the web page which is written in <title> tag 

		System.out.println(driver.getCurrentUrl());
		
	// dr.navigate().to("https://www.google.com");
		
		
	//MEthod -1 
//			driver.findElement(By.id("email")).sendKeys("Swapnil@Gmail.com");
			
	//MEthod -2 
			//WebElement email =driver.findElement(By.id("email"));
			//email.sendKeys("rajesn");
			
	//Method -3 
//			String uname="Swapnil@1234";
//			By user =By.id("email");
//			WebElement user1 =driver.findElement(user);
//			user1.sendKeys(uname);
		
		
		
		
	/// Locator by.name
		
//			driver.findElement(By.name("email")).sendKeys("sAP");
		
		
		// Locator By.className
		
		WebElement email=driver.findElement(By.className("inputtext"));
		email.sendKeys("ssssss");
		
		//Locator by.tagName
			
		List<WebElement> alink =driver.findElements(By.tagName("a"));
		System.out.println(alink.size());
		
		Thread.sleep(10);
		//Locator by.linkText
		
//		driver.findElement(By.linkText("Forgotten password")).click();
		//Locator By. partialLinkText
		
	//	driver.findElement(By.partialLinkText("password")).click();
		
		
		//Locator By.Xpath 
			
			WebElement password =driver.findElement(By.xpath("//*[@id=\"pass\"]"));   // relative XPath
			
			password.sendKeys("1234#dfs");
			
			
			WebElement Email =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
			Email.sendKeys("Swapnil");
		
		
		
		
		//		dr.quit();
	}

}

/*
 * MUST-KNOW XPath Interview Questions
1️⃣ What is the difference between Absolute XPath and Relative XPath?

✅ Very commonly asked

You must clearly say:

Absolute XPath starts with / and is fragile

Relative XPath starts with // and is stable

2️⃣ Which XPath is preferred in automation and why?

✅ Asked often

Correct answer:

Relative XPath, because it is shorter, more reliable, and not dependent on full DOM structure.

3️⃣ How do you handle dynamic elements using XPath?

✅ Extremely important

Expected keywords:

contains()

starts-with()

text()

If you don’t know this, it’s a red flag in interviews.

4️⃣ What is the difference between findElement() and findElements()?

✅ Almost guaranteed question

They expect:

findElement() → first match or exception

findElements() → list, no exception

5️⃣ How do you locate an element when there is no id or name?

✅ Real-world interview question

Correct approach:

Use XPath

Use text()

Use axes if needed

6️⃣ What are XPath axes? Have you used them?

✅ Asked in 3–5+ years experience interviews

They want names like:

parent

child

following-sibling

preceding-sibling

Even knowing one or two is enough.

7️⃣ XPath vs CSS Selector — which one do you use and why?

✅ Very common

Good answer:

CSS is faster and simpler

XPath is more powerful

Use XPath when CSS can’t handle the case

8️⃣ Can you write XPath for a button using text?

✅ Live coding question

Example they expect:

//button[text()='Login']

🚫 NOT IMPORTANT (Rarely Asked)

❌ Very complex XPath expressions
❌ XML theory
❌ Namespaces
❌ Absolute XPath tricks

Interview Truth 💬

If you confidently answer questions 1–5, you already beat 70% of candidates.

If you want next, I can:

Give model interview answers

Do mock interview Q&A

Give XPath practice tasks

Show real interviewer follow-up questions

Tell me how you want to practice 👊
 * */
