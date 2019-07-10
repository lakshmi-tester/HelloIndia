package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.Xls_Reader;





;

public class NewTest {
  @Test
  public void f() {System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	  Xls_Reader reader=new Xls_Reader("C:\\Users\\Ramesh\\Desktop\\lakshmi\\HSe\\src\\testdata\\lakshmi1.xls.xlsx");
	  String name=reader.getCellData("lax", "firstname", 2);
	  System.out.println(name);
	  
	  driver.findElement(By.id("firstName")).sendKeys(name);
	  
	  
	  
  
  }
  
}
