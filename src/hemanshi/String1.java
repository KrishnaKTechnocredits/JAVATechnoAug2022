//1) Write a program to rearrange String in given format. 
//String str = "He20maNsHi28";
//output : "HNH2028emasi";
//Hint : AllDigitAllCharacter

package hemanshi;

import java.lang.String;

public class String1 {
	String getString(String input) {
		String numberStr="";
		String lowercaseStr="";
		String uppercaseStr="";
		String str="";

		int lenght=input.length();

		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				numberStr+=ch;
				}
			else if(Character.isLetter(ch)&& Character.isLowerCase(ch))	
				lowercaseStr+=ch;
			else if(Character.isLetter(ch)&& Character.isUpperCase(ch))	
				uppercaseStr+=ch;

			str= uppercaseStr + numberStr + lowercaseStr; 
		}
		return str;
	}

	public static void main(String[] args) {
		String1 s1=new String1();
		s1.getString("He20maNsHi28");
		System.out.println(s1.getString("HNH2028emasi"));
	}

}


