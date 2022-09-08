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
output : 4*/
package ankitaBarwad;

public class Rearrange_FindFrequency_String {

	//program to rearrange String in given format (AllDigitAllCharacter)
	String getAllDigitAllCharacter(String inputString) {
		String allDigit = "";
		String allChar = "";
		char ch;
		for (int index = 0; index <= inputString.length() - 1; index++) {
			ch = inputString.charAt(index);
			if (Character.isDigit(ch)) {
				allDigit = allDigit + ch;
			} else
				allChar = allChar + ch;
		}
		return allDigit + allChar;
	}

	//program to rearrange String in given format (Uppercase letters + digits + LowerCase letter)
	String getUpperDigitLowerString(String inputString) {
		String upperCaseString = "", lowerCaseString="", allDigit="";
		char ch;
		for(int index = 0; index<=inputString.length()-1;index++) {
			ch = inputString.charAt(index);
			if(Character.isUpperCase(ch))
				upperCaseString = upperCaseString + ch;
			else if (Character.isLowerCase(ch))
				lowerCaseString = lowerCaseString + ch;
			else if (Character.isDigit(ch))
				allDigit = allDigit + ch;
		}
		return upperCaseString+allDigit+lowerCaseString;
	}
	
	//Program to Find frequency of given character from given String
	int getFrequencyOfChar(String inputString, char targetChar) {
		inputString = inputString.toLowerCase();
		int count=0;
		char ch;
		for(int index = 0; index <= inputString.length()-1;index++) {
			ch  = inputString.charAt(index);
			if(targetChar == ch)
				count++;
		}
		return count;
	}
	
	//main() method
	public static void main(String[] args) {
		String input = "";
		Rearrange_FindFrequency_String example1 = new Rearrange_FindFrequency_String();
		
		input = "te2cH4no";
		System.out.println("Input String : " + input + "\nAllDigitAllCharacter String : " + example1.getAllDigitAllCharacter(input) + "\n");
		
		input = "t8EcHNo5Cred3iTs";
		System.out.println("Input String : " + input + "\nUpperDigitLowerString String : " + example1.getUpperDigitLowerString(input) + "\n");
		
		char targetChar = 't';
		input = "TechnoTtcredits";
		System.out.println("Input String : " + input + "\nFrequencyOfChar '" +targetChar +"' in String : " + example1.getFrequencyOfChar(input,targetChar));
	}
}
