/*Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1
*/

package apurvaBabel.Assignment21to30;

public class Assignment28_SwitchCaseProgram4 {

	// Method to print count of each vowel in given string array using switch case
	void printVowelCount(String[] arr) {
		for (String name : arr) {
			printVowelCount(name);
		}
	}

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
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Assignment28_SwitchCaseProgram4 assignment28 = new Assignment28_SwitchCaseProgram4();
		String[] arr = { "Technocredits", "Swati", "Aashvi" };
		assignment28.printVowelCount(arr);
	}
}
