/*Assignment 18 - 8th Sep 2022
Write a program to rearrange String in given format
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter */

package komalShrivastava;

public class RearrangeString {

	String getRearrangedString(String inputString) {
		String str1 = "";
		String str2 = "";
		for(int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			if(Character.isLetter(ch)) 
				str1 = str1 + ch;
			else if(Character.isDigit(ch))	
				str2 = str2 + ch;
		}
		return str2+str1;
	}
	
	public static void main(String[] args) {
		RearrangeString rearrangeString = new RearrangeString();
		String rearrangedString = rearrangeString.getRearrangedString("te2cH4no");
		System.out.println(rearrangedString);
	}
}