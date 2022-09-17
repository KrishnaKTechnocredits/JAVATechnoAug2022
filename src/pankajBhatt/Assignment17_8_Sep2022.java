/*Assignment - 18 : 8th Sep'2022

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


Notes : 8th Sep'2022

Character is a predefined class in java.
1) boolean isDigit(char ch)
2) boolean isLetter(char ch)
3) boolean isLowerCase(char ch)
4) boolean isUpperCase(char ch)
5) int getNumericValue(char ch)
6) char toLowerCase(char ch)
7) char toUpperCase(char ch)
Note : All above methods are static methods.*/

package pankajBhatt;

public class Assignment17_8_Sep2022 {

	
	String rearrangeString1(String str) {
		String formattedString = "";
		String chars = "";
		for(int i = 0; i < str.length() ; i++ ) {
			if(Character.isDigit(str.charAt(i))) {
				formattedString = formattedString + str.charAt(i);
			}
			else {
				chars = chars + str.charAt(i);
			}
		}
		formattedString = formattedString + chars;
		return formattedString;
	}

	String rearrangeString2(String str) {
		String formattedString = "";
		String digits = "";
		String lowerCase = "";
		for(int i = 0; i < str.length() ; i++ ) {
			if(Character.isUpperCase(str.charAt(i))) {
				formattedString += str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i))){
				digits += str.charAt(i);
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				lowerCase += str.charAt(i);
			}
		}
		formattedString = formattedString + digits + lowerCase;
		return formattedString;
	}
	
	int frequencyOfGivenCharInString(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length() ; i++) {
			if(Character.toLowerCase(str.charAt(i)) == ch) {
				count++;
			}
		}
		return count ;
	}
	
	public static void main(String[] args) {
		Assignment17_8_Sep2022 assignment17_8_Sep2022 = new Assignment17_8_Sep2022();
		System.out.println(assignment17_8_Sep2022.rearrangeString1("te2cH4no"));
		System.out.println(assignment17_8_Sep2022.rearrangeString2("t8EcHNo5Cred3iTs"));
		System.out.println(assignment17_8_Sep2022.frequencyOfGivenCharInString("TechnoTtcreditsT", 't'));
	}
}
