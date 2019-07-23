package email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("lakshmi@123");
		
	}
}
