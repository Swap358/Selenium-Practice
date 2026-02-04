package com.multipleWindows;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx {

	public static void main(String[] args) throws InterruptedException {
//		 TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demoqa.com/browser-windows");
		 driver.manage().window().maximize();
		 String parent=driver.getWindowHandle();
		 System.out.println(driver.getTitle());
		 System.out.println(parent);
		 driver.findElement(By.id("tabButton")).click();
		 Thread.sleep(1000);
		
		
		 Set<String> allWindows = driver.getWindowHandles();
//		List<String> AllWind=new ArrayList<>(allWindows);
		
	 for(String win:allWindows) {
			 if(!win.equals(parent)) {
				driver.switchTo().window(win);
				
				String txt =driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("text :"+txt);
			 
				driver.close();
			 }

	 }
	 driver.switchTo().window(parent);
	 System.out.println(driver.getTitle());
		

	}

}
