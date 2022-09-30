/*Program 4:Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}{"technocredits", "swati", "aashvi"}
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

package sagarY.Assignment28;
import java.util.Arrays;

public class PrintVowelCountFromArray {

	void printEachVowelCount(String[] input) {
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;

		for (String str : input) {
			str = str.toLowerCase();

			for (int index = 0; index < str.length(); index++) {
				char ch1 = str.charAt(index);

				switch (ch1) {

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
				}
			}
			System.out.println("Vowel count in string: " + str);
			if (countA > 0) {
				System.out.println("a" + "--> " + countA);
				countA = 0;
			}
			if (countE > 0) {
				System.out.println("e" + "--> " + countE);
				countE = 0;
			}
			if (countI > 0) {
				System.out.println("i" + "--> " + countI);
				countI = 0;
			}
			if (countO > 0) {
				System.out.println("o" + "--> " + countO);
				countO = 0;
			}
			if (countU > 0) {
				System.out.println("u" + "--> " + countU);
				countU = 0;
			}
			System.out.println("***********************************");
		}

	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "swati", "aashvi" };
		System.out.println("Program 4 : Print count of each vowels in a \ngiven String Array using switch case.");
		System.out.println("****************************************************");
		System.out.println("Input: " + Arrays.deepToString(str));
		System.out.println("\nOutput: Each vowel count from each String in an Array is: ");
		System.out.println("*****************************************************");
		new PrintVowelCountFromArray().printEachVowelCount(str);
	}

}
