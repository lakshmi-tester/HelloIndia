package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f3() {
	  System.out.println("rest");
  }
  @BeforeTest
  public void git() {
	  System.out.println("yoop");
  }
}
