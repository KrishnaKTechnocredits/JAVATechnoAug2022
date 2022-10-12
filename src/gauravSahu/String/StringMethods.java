package gauravSahu.String;

import java.util.Arrays;

public class StringMethods {
	
	void methods(String input) {
		System.out.println("Length of input : " + input.length());
		System.out.println("Lower case : " + input.toLowerCase());
		System.out.println("Upper Case : " + input.toUpperCase());
		System.out.println("Character of input are : ");
		for(int i = 0; i<input.length();i++) {
			System.out.print("-" +input.charAt(i));
			System.out.println("-" + input.indexOf(input.charAt(i)));
		}
		char[] ch = new char[input.length()];
		System.out.println("Last index of : " + input.lastIndexOf('G'));
		System.out.println(input.replace('G', 'g'));
		System.out.println(input.replace("rav" ,"RAV" ));
		System.out.println(input.replaceFirst("KUM","kum"));
		System.out.println(input.contains("Sahu"));
		String[] output = input.split(" ");
		System.out.println(Arrays.toString(output));
		System.out.println(input.substring(3));
		System.out.println(input.substring(4, 8));
		System.out.println(input.valueOf(input.charAt(16)));
		System.out.println(input.valueOf(16));
		//System.out.println(join(" ", String [] output));
	}
	


	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		String input = "GauravKumarSahu3101";
		sm.methods(input);
	}

}
