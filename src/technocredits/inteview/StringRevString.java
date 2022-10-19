package technocredits.inteview;

import java.util.Arrays;

public class StringRevString {

	static String m1(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(m1("maulik"));
		
		String str = "etegdfg";
		char[] ch = str.toCharArray();
		
		
	}
}
