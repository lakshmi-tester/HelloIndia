package demo;

import org.testng.annotations.Test;

public class NewTest7 {
  @Test
  public void f() {
	  String str="deepika";
	  String str1=str.replaceAll("[AEIOUaeiou]", "");
	  System.out.println(str1);
  }
}
