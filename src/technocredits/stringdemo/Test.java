package technocredits.stringdemo;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = "Hello";
		
		str2 = str1;
		System.out.println(str1 == str2);
		System.out.println(str1 + "--" + str2);
		
		System.out.println(str1);
		
		int x = 10;
		String[] name = {"Hi","Hello"};
		System.out.println(Arrays.toString(name));
	}
}
