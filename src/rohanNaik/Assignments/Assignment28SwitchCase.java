/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
output : e

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
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

package rohanNaik.Assignments;

public class Assignment28SwitchCase {

	void arrayVowelCount(String[] input) {

		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			str.toLowerCase();
			int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);

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
				}
			}
			System.out.println("==========================================");
			System.out.println("Name : " + input[i]);
			System.out.println("a count is" + countA);

			System.out.println("e count is" + countE);

			System.out.println("i count is" + countI);

			System.out.println("o count is" + countO);

			System.out.println("u count is" + countU);

		}
	}

	void printCountOfEachVowel(String input) {
		input.toLowerCase();
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
			}
		}

		System.out.println("a count is" + countA);

		System.out.println("e count is" + countE);

		System.out.println("i count is" + countI);

		System.out.println("o count is" + countO);

		System.out.println("u count is" + countU);

	}

	String getVowel(String input) {
		input.toLowerCase();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'a':

				return "a";

			case 'e':

				return "e";

			case 'i':

				return "i";

			case 'o':

				return "o";

			case 'u':

				return "u";
			}
		}
		return "";

	}

	int getCount(String input) {
		input.toLowerCase();
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'a':
				count++;
				break;

			case 'e':
				count++;
				break;

			case 'i':
				count++;
				break;

			case 'o':
				count++;
				break;

			case 'u':
				count++;
				break;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Assignment28SwitchCase obj = new Assignment28SwitchCase();
		System.out.println("------------Program 1 ------------------");
		int count = obj.getCount("Technocredits");
		System.out.println(count);
		System.out.println("------------Program 2 ------------------");
		String vowel = obj.getVowel("Technocredits");
		System.out.println(vowel);
		System.out.println("------------Program 3------------------");
		obj.printCountOfEachVowel("Technocredits");
		System.out.println("------------Program 4-----------------");
		String[] input = { "technocredits", "swati", "aashvi" };
		obj.arrayVowelCount(input);
	}

}
