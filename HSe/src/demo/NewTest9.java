package demo;

import org.testng.annotations.Test;

public class NewTest9 {
  @Test
  public void f() {
	  String st="lakshmi devi";
	  String resu="";
	  String[] arr=st.split("");
	  for(int i=st.length()-1;i>=0;i--) {
		  resu+=arr[i]+"";
		  System.out.println(resu.subSequence(0,resu.length()-1 ));
	  }
	  
  }
}
