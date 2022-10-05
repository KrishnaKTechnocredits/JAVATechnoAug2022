/*Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e
*/

package deepakPatil.Assignment28SwitchCase;

public class Assignment28_1 {

	int getVowelCount(String str) {
		str = str.toLowerCase();
		int vowelsConut = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsConut++;
			}
		}
		return vowelsConut;
	}

	char getFirstVowel(String str) {
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
				return ch;
			case 'e':
				return ch;
			case 'i':
				return ch;
			case 'o':
				return ch;
			case 'u':
				return ch;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment28_1 assignment28_1 = new Assignment28_1();
		String input ="TechnOcredits";
		System.out.println("Given input string is :" + input);
		System.out.println("Vowels from given string is: " + assignment28_1.getVowelCount(input));
		System.out.println("First ovel from given string is: " + assignment28_1.getFirstVowel(input));
	}
}
