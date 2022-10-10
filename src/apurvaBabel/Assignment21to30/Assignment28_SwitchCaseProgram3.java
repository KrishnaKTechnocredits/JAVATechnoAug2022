/*Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
*/

package apurvaBabel.Assignment21to30;

public class Assignment28_SwitchCaseProgram3 {

	// Method to print count of each vowel in given string using switch case
	void printVowelCount(String input) {
		System.out.println("Vowel count in " + input + " : ");

		input = input.toLowerCase();
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'a':
				countA++;
				break;

			case 'e':
				countE++;
				break;

			case 'i':
				countI++;
				break;

			case 'o':
				countO++;
				break;

			case 'u':
				countU++;
				break;

			default:
			}
		}
		System.out.println("a --> " + countA);
		System.out.println("e --> " + countE);
		System.out.println("i --> " + countI);
		System.out.println("o --> " + countO);
		System.out.println("u --> " + countU);
	}

	public static void main(String[] args) {
		Assignment28_SwitchCaseProgram3 assignment28 = new Assignment28_SwitchCaseProgram3();
		String input = "Technocredits";
		assignment28.printVowelCount(input);
	}
}
