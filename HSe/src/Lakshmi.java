import com.sun.java_cup.internal.runtime.Scanner;

public class Lakshmi { 
	public static void main(String[] args) {

       
String s="lakshmi";
		String rev="";
		int len=s.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			//System.out.println(rev);
		}
		System.out.println(rev);
}
}

