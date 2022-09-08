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
	
	String rearrangeStringDigitsChar(String inputString) {
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
	
	String rearrangeString(String inputString) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment18 assignment18 = new Assignment18();
		
		String input="te2cH4no", input1="t8EcHNo5Cred3iTs";
		System.out.println("Input String: \n"+input+"\nRearranged as digits first followed by characters: \n"+assignment18.rearrangeStringDigitsChar(input));
		System.out.println("\nInput String: \n"+input1+"\nRearranged as uppercase characters first then digits and then lowercase characters: \n"+assignment18.rearrangeString(input1));
	}

}
