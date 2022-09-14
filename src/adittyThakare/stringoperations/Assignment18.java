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
package adittyThakare.stringoperations;

public class Assignment18 {
	
	String getRearrangeStringDigitsChar(String inputString) {
		String digitString="", charString="";
		
		for(int index=0;index<=inputString.length()-1;index++) {
			char ch = inputString.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digitString = digitString + num;
			}else {
				charString = charString + ch;
			}
		}
		return digitString+charString;
	}
	
	String getRearrangeString(String inputString) {
		String digitString="", lowercaseString="", uppercaseString="";
		
		for(int index=0;index<=inputString.length()-1;index++) {
			char ch = inputString.charAt(index);
			
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digitString = digitString + num;
			}else if(Character.isLowerCase(ch))
					lowercaseString = lowercaseString + ch;
			else if(Character.isUpperCase(ch))
					uppercaseString = uppercaseString + ch;
			}

		return uppercaseString+digitString+lowercaseString;
	}
	
	int getFrequencyOfCharacter(String inputString, char targetChar) {
		int count=0;
		
		inputString = inputString.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		
		for(int index=0;index<=inputString.length()-1;index++){
			char ch = inputString.charAt(index);
			if(ch == targetChar)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment18 assignment18 = new Assignment18();
		
		String input="te2cH4no", input1="t8EcHNo5Cred3iTs", input2="TechnoTtcredits";
		char targetChar = 't';
		System.out.println("Input String: "+input+"\nRearranged as digits first followed by characters: "+assignment18.getRearrangeStringDigitsChar(input));
		System.out.println("\nInput String: "+input1+"\nRearranged as uppercaseCharacters_digits_lowercaseCharacters: "+assignment18.getRearrangeString(input1));
		System.out.println("\nInput String: "+input1+"\nFrequency of "+targetChar+": "+assignment18.getFrequencyOfCharacter(input2,targetChar));
		
	}

}
