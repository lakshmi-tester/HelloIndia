package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest5 {
 


@BeforeMethod
public void run() {
	System.out.println("testng");
	
}

@Test(priority=2)
public void f() {
	  System.out.println("test1");
}
@Test
public void rum() {
	System.out.println("dsagjh");
}
@AfterMethod
public void test2() {
	System.out.println("ping");
}

@BeforeSuite
public void run4()
{

System.out.println("tesd");
}

@BeforeTest
public void test6() {
	System.out.println("test67");
}









}