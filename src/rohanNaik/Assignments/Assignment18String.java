/*1. Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter

2.Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
Character.isUpperCase(ch), Character.isLowerCase(ch)

3) Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4

*/

package rohanNaik.Assignments;

public class Assignment18String {
	
	void frequencyOfCharacter() {
		
		String str = "TechnoTtcrtTedits";
		char targetChar = 't';
		int count = 0;
				
		String lowercaseString = str.toLowerCase();
		
		for(int index=0; index<str.length();index++) {

			char ch = lowercaseString.charAt(index);
			
			if(ch == targetChar)
				count++;
		}
		
		System.out.println(count);
		
		
	}
	
	void getRearrangedString() {
		String str = "t8EcHNo5Cred3iTs";
		String str1 = "";
		String str2 = "";
		String str3 = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isUpperCase(ch)) {
				str1 = str1 + ch;
			} else if (Character.isLowerCase(ch)) {
				str2 = str2 + ch;
			} else if (Character.isDigit(ch)) {
				str3 = str3 + ch;
			}
		}

		System.out.println(str1 + str2 + str3);
	}
	
	
	
	void getDigitRearrangedString() {

		String str = "te2cH4no9";
		String str1 = "";
		String str2 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean isDigit = Character.isDigit(ch);

			if (isDigit == true)
				str1 = str1 + ch;
			else
				str2 = str2 + ch;
		}

		System.out.println(str1 + str2);
	}

	public static void main(String[] args) {

		Assignment18String obj = new Assignment18String();
		obj.getDigitRearrangedString();	
		obj.getRearrangedString();
		obj.frequencyOfCharacter();

	}

}
