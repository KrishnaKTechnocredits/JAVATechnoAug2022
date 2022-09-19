/*
 * Assignment - 18 : 8th Sep'2022

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
package deepakBorse.Assignments;

public class Assignment18StringOps2 {

	String AllDigitAllCharacter(String inputstring) {
		String alldigit = "";
		String allletters = "";
		for (int i = 0; i < inputstring.length(); i++) {
			char ch = inputstring.charAt(i);
			if (Character.isDigit(ch)) {
				alldigit = alldigit + ch;
			} else {
				Character.isLowerCase(ch);
				allletters = allletters + ch;
			}
		}
		return (alldigit + allletters);
	}

	String UpcaseDigiLowcase(String inputstring) {
		String alldigit = "";
		String upcase = "";
		String lowcase = "";
		for (int i = 0; i < inputstring.length(); i++) {
			char ch = inputstring.charAt(i);
			if (Character.isUpperCase(ch)) {
				upcase = upcase + ch;
			}
			if (Character.isDigit(ch)) {
				alldigit = alldigit + ch;
			}
			if (Character.isLowerCase(ch)) {
				lowcase = lowcase + ch;
			}
		}
		return (upcase + alldigit + lowcase);
	}

	int getFreqChar(String inputstring, char targetchar) {
		int charcount = 0;
		inputstring = inputstring.toLowerCase();

		for (int i = 0; i < inputstring.length(); i++) {
			targetchar = Character.toLowerCase(targetchar);
			char ch = inputstring.charAt(i);
			if (ch == targetchar)
				charcount++;
		}
		return (+charcount);
	}

	public static void main(String[] args) {
		String alldigit = new Assignment18StringOps2().AllDigitAllCharacter("te2cH4no");
		System.out.println("All Digit and All letter in rearrange form :" + alldigit);

		String rearrange1 = new Assignment18StringOps2().UpcaseDigiLowcase("t8EcHNo5Cred3iTs");
		System.out.println("Arrange string Uppercase Digit and lowercase :" + rearrange1);

		int charcount = new Assignment18StringOps2().getFreqChar("TechnoTtcredits", 'T');
		System.out.println("Frequency of 't' in the string :" + charcount);
	}

}
