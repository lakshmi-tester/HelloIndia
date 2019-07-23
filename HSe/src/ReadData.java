import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		  Xls_Reader reader=new Xls_Reader("C:\\Users\\Ramesh\\git\\HelloIndia\\HSe\\src\\testdata\\ram.xlsx");
		 
		  int rowcount=reader.getRowCount("lax");
		  for(int rownum=2;rownum<=rowcount;rownum++) {
		  System.out.println("=================");
		  String name=reader.getCellData("lax", "firstname", rownum);
		  System.out.println(name);
		  driver.findElement(By.xpath("//input[@type='text' and@name='firstName']")).clear();
		  driver.findElement(By.xpath("//input[@type='text' and@name='firstName']")).sendKeys(name);
		 
		  String lastname=reader.getCellData("lax", "lastname", rownum);
		  System.out.println(lastname);
		  driver.findElement(By.id("lastName")).clear();
		  driver.findElement(By.id("lastName")).sendKeys(lastname);

		  
		  }
		  driver.quit();
}

}