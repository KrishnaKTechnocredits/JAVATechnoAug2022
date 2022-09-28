
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

package anujaD;

public class StringProgram {

	static String rearrangeString(String input) {
		String letter = "";
		String digit = "";
		for (int index = 0; index < input.length(); index++) {
			Character ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				letter = letter + ch;
			}

		}
		return digit + letter;

	}

	static String rearrangeString1(String input) {
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		for (int index = 0; index < input.length(); index++) {
			Character ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			}
		}
		return upperCase + lowerCase + digit;

	}

	static int findFrequency(String input, char targetChar) {
		int count = 0;
		input = input.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(StringProgram.rearrangeString("te2cH4no"));
		System.out.println(StringProgram.rearrangeString1("t8EcHNo5Cred3iTs"));
		System.out.println(StringProgram.findFrequency("TechnoTtcredits", 't'));
	}

}
