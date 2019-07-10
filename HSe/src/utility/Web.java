package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("http://www.onlinestore.toolsqa.com");
		
		 driver.quit();
		 
		 
	}

}
