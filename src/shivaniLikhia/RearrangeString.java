//Assignment - 18 : 8th Sep'2022

//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter
package shivaniLikhia;

public class RearrangeString {
	
	String getRearrangedString(String str) {
		int length = str.length();
		String str1 = "";
		String str2 = "";
		for(int index=0;index<=length-1;index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				str1 = str1 + str.charAt(index); 
			}
			else if(Character.isLetter(ch)) {
				str2 = str2 + str.charAt(index);
			}
		}
		return str1+str2;
	}
	public static void main(String[] args) {
		System.out.println(new RearrangeString().getRearrangedString("te2cH4no"));
	}
}
