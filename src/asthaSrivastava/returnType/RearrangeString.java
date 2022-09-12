/*1) Write a program to rearrange String in given format. 
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
package asthaSrivastava.returnType;

public class RearrangeString {

	String getDigitAndChar(String str) { // Program 1
		str.length();
		String tDigit = "";
		String tLetter = "";
		// String result = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				tDigit = tDigit + ch;
			} else if (Character.isLetter(ch))
				tLetter = tLetter + ch;

		}

		return tDigit + tLetter;
	}

	String getUpperLowerLetter(String input) { // Program 2
		input.length();
		String tDigit = "";
		String lowerLetter = "";
		String upperLetter = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				tDigit = tDigit + ch;
			} else if (Character.isUpperCase(ch)) {
				upperLetter = upperLetter + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerLetter = lowerLetter + ch;
			}

		}

		return upperLetter + tDigit + lowerLetter;
	}

	int getCountOfTargetChar(String name, char targetChar) { // Program 3
		name.length();
		int count = 0;
		name = name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String output = new RearrangeString().getDigitAndChar("te2cH4no");
		System.out.println("Rearranged String is : " + output);

		String output1 = new RearrangeString().getUpperLowerLetter("t8EcHNo5Cred3iTs");
		System.out.println("Rearranged String is : " + output1);

		String name = "TechnoTtcredits";
		char targetChar = 't';
		int output2 = new RearrangeString().getCountOfTargetChar(name, targetChar);
		System.out.println("From given input " + name + " frequency of character " + targetChar + " is " + output2);
	}

}
