package gauravSahu.String;

import java.util.Arrays;

public class StringMethods {
	
	
	void strMethods(String name) {
		String[] splitchar = new String[name.length()];
		System.out.println("String length : "+name.length()); // Length of String in integer
		for(int index=0;index<name.length();index++) { // Iterate to get Character of string
			System.out.println(name.charAt(index)); // Got the character of String in character
		}
		char[] ch = name.toCharArray();
		System.out.println(ch);
		System.out.println(name.toUpperCase()); // To Upper case
		System.out.println(name.toLowerCase());// To lower case
		splitchar = name.split(" "); // Spliting the String
		System.out.println(Arrays.toString(splitchar));
		System.out.println(name.replace('G', ' '));
		System.out.println(name.indexOf('G'));
		System.out.println(name.lastIndexOf('G'));
		System.out.println(name.contains("G"));
	}
	
	public static void main(String[] args) {
		StringMethods s1 = new StringMethods();
		String[] arr = {"GauravG","GarvisG","GAkankshaG","GMeeraG","GDomanlalG","GSahuG"};
		System.out.println("Array length : "+ arr.length);
		for(String name : arr) {
			s1.strMethods(name);
			System.out.println("**********************");
		}
	}

}
