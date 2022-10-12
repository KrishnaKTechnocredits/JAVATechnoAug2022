/*Assignment - 18 :

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

package apurvaBabel.Assignment11to20;

public class Assignment18 {

	// Rearrange string as digit,characters format
	String rearrangeString(String input) {
		String tempDigit = "";
		String tempLetter = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			} else if (Character.isLetter(ch)) {
				tempLetter = tempLetter + ch;
			}
		}
		return tempDigit + tempLetter;
	}

	// Rearrange string as upper case,digit,lower case format
	String rearrangeStringAsUpperDigitLower(String input) {
		String tempUpperCase = "";
		String tempDigit = "";
		String tempLowerCase = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			} else if (Character.isUpperCase(ch)) {
				tempUpperCase = tempUpperCase + ch;
			} else if (Character.isLowerCase(ch)) {
				tempLowerCase = tempLowerCase + ch;
			}
		}
		return tempUpperCase + tempDigit + tempLowerCase;
	}

	// Get frequency of given character from given string
	int getFrequencyOfGivenCharacter(String input, char targetChar) {
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
		Assignment18 assignment18 = new Assignment18();
		String input = "te2cH4no";
		System.out.println("Rearrangement of string " + input + " as " + assignment18.rearrangeString(input));

		input = "t8EcHNo5Cred3iTs";
		System.out.println(
				"Rearrangement of string " + input + " as " + assignment18.rearrangeStringAsUpperDigitLower(input));

		input = "TechnoTtcredits";
		char targetChar = 't';
		System.out.println("Frequency of " + targetChar + " in " + input + " is "
				+ assignment18.getFrequencyOfGivenCharacter(input, targetChar));
	}
}
