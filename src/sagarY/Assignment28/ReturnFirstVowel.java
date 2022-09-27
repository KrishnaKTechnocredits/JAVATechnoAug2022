/*Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e
*/

package sagarY.Assignment28;

public class ReturnFirstVowel {

	char returnFirstVowel(String input) {
		char ch = 'a';
		input = input.toLowerCase();

		for (int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);

			switch (ch1) {

			case 'a':
				return ch1;

			case 'e':
				return ch1;

			case 'i':
				return ch1;

			case 'o':
				return ch1;

			case 'u':
				return ch1;
			}
		}
		return ch;

	}

	public static void main(String[] args) {
		System.out.println("Program 2 : Return First of vowels in a \ngiven String using switch case.");
		System.out.println("******************************************");
		String input = "TechnOcredits";
		System.out.println("Given String: " +input);
		char ch = new ReturnFirstVowel().returnFirstVowel(input);
		System.out.println("First vowels from string is " +":"+ch);
	}
}
