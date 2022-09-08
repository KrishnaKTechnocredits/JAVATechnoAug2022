/*
Assignment - 18 : 8th Sep'2022

1) Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter

2) Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

3) Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4
*/

package pranjaliV.assignment18;

public class StringAssignment2 {
	
	String getAllDigitAllCharacter(String input) {
		String strDigit = "";
		String strLetter = "";
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				strDigit = strDigit + ch;
			}
			else if(Character.isLetter(ch)){
				strLetter = strLetter + ch;
			}
		}
		return strDigit+strLetter;
	}
	
	String getRearrangeString(String input) {
		String strUpperCase= "";
		String strLowerCase= "";
		String strDigit= "";
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					strUpperCase = strUpperCase + ch;
				}
				else if(Character.isLowerCase(ch)) {
					strLowerCase = strLowerCase + ch;
				}
			}
			else if(Character.isDigit(ch)) {
				strDigit = strDigit + ch;
			}
		}
		return strUpperCase+strDigit+strLowerCase;
	}
	
	int getFrequencyOfChar(String input,char target) {
		int count = 0;
		input = input.toLowerCase();
		for(int index=0; index<= input.length()-1; index++) {
			char ch = input.charAt(index);
			if(ch==target) {
				count++;
			}
		}
		return count;
	}
	
	void printInfo1(String input) {
		System.out.println("All Digit all Character format of string '"+ input +"'  is : " + getAllDigitAllCharacter(input));
		System.out.println("Uppercase letters + digits + LowerCase letter format of string '"+ input +"'  is : " + getRearrangeString(input));
	}
	
	void printInfo2(String input, char target) {
		System.out.println("Frequency of given character '"+target+"' from given String '"+input+"' is : " + getFrequencyOfChar(input,target));
	}
	
	public static void main(String args[]) {
		StringAssignment2 stringAssignment2 = new StringAssignment2();
		stringAssignment2.printInfo1("te2cH4no");
		System.out.println("");
		stringAssignment2.printInfo1("t8EcHNo5Cred3iTs");
		System.out.println("");
		stringAssignment2.printInfo2("TechnoTtcredits",'t');
	}
}
