package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest6 {
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("http://www.toolsqa.com");
		 String title=driver.getTitle();
		
		 System.out.println(title);
		 if(title.equals("Free QA Automation Tools Tutorial for Beginners with Examples")){
			 System.out.println("correct");
		 }
		 else
		 {
			 System.out.println("incorrect");
			
			}
		 
		 System.out.println(driver.getCurrentUrl());
		 //System.out.println(driver.getPageSource());
}
  

  
}
