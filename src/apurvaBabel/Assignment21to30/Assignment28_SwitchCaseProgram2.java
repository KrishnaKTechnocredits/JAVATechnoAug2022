/*Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e
*/

package apurvaBabel.Assignment21to30;

public class Assignment28_SwitchCaseProgram2 {

	// Method to return first vowel from given string using switch case
	char getFirstVowel(String input) {
		input = input.toLowerCase();
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

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

			default:
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment28_SwitchCaseProgram2 assignment28 = new Assignment28_SwitchCaseProgram2();
		String input = "Technocredits";
		char ch = assignment28.getFirstVowel(input);
		System.out.println("First vowel in " + input + " --> " + ch);
	}
}
