/*Write a program to rearrange String in given format. 
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
package shrutiArora;
public class Assignment18 {
	void rearrangeStringInFormat(String str) {
		String allDigit = "";
		String allCharacter = "";
		String finalString = "";
		for(int index = 0 ; index<= str.length()-1; index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				allDigit += ch;
			}
			else {
				allCharacter += ch;
			}
		}
		finalString = allDigit + allCharacter;
		System.out.println("input: " + str);
		System.out.println("Output: " + finalString);
	}
	void printStringInGivenFormat(String str) {
		String upperCaseString = "";
		String digitString = "";
		String lowerCaseString = "";
		String finalString = "" ;
		
		for(int index = 0 ; index<= str.length()-1;index++){
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				upperCaseString += ch;
			}
			else if (Character.isLowerCase(ch)) {
				lowerCaseString += ch;
			}
			else if(Character.isDigit(ch)) {
				digitString +=  ch;
			}
			else {
				upperCaseString += ch;
			}
		}
		finalString = upperCaseString + digitString +  lowerCaseString;
		System.out.println("input: " + str );
		System.out.println("Output: " + finalString);
	}
	void findFindFrequencyOfChar(String str , char targetChar) {
		str = str.toLowerCase();
		int count = 0;
		for(int index = 0 ; index <= str.length()-1;index++) {
			if(targetChar== str.charAt(index)) {
				count++;
			}
		}
		System.out.println("input: " + str );
		System.out.println("output: " + count);
		
	}
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		System.out.println("*****************************Program-1*************************************");
		assignment18.rearrangeStringInFormat("te2cH4no");
		System.out.println("*****************************Program-2*************************************");
		assignment18.printStringInGivenFormat("t8EcHNo5Cred3iTs");
		char ch = 't';
		System.out.println("*****************************Program-3*************************************");
		assignment18.findFindFrequencyOfChar("TechnoTtcredits", ch);
	}
}	