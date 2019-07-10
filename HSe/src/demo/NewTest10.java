package demo;

import org.testng.annotations.Test;

public class NewTest10 {
  @Test
  public void f() {

      String s[] = "i like this program very much".split(" "); 
      String ans = ""; 
      for (int i = s.length - 1; i >= 0; i--) { 
          ans += s[i] + " "; 
      } 
      System.out.println("Reversed String:"); 
      System.out.println(ans.substring(0, ans.length() - 1));
  
  }
}
  

