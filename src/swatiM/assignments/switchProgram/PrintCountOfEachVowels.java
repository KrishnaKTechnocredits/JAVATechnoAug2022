package swatiM.assignments.switchProgram;
/*Assignment - 28 : 25th Sep'2022

Program 4: [15 mins]
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
         i -> 1 */

public class PrintCountOfEachVowels {

	void printCountOfEachVowel(String[] input) {
		for (String name : input) {
			printCountOfEachVowel(name);
		}

	}

	void printCountOfEachVowel(String input) {
		System.out.println("vowel count in technocredits " + input + ":");
		// input = input.toLowerCase();
		int Acount = 0, Ecount = 0, Icount = 0, Ocount = 0, Ucount = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'a':
				Acount++;
				break;
			case 'e':
				Ecount++;
				break;
			case 'i':
				Icount++;
				break;
			case 'o':
				Ocount++;
				break;
			case 'u':
				Ucount++;
				break;
			default:
				break;

			}

		}
		System.out.println("a --> " + Acount);
		System.out.println("e --> " + Ecount);
		System.out.println("i --> " + Icount);
		System.out.println("o --> " + Ocount);
		System.out.println("u --> " + Ucount);
	}

	public static void main(String[] args) {
		PrintCountOfEachVowels assignment28_Prog4 = new PrintCountOfEachVowels();

		String[] input = { "Technocredits", "Swati", "Aashvi" };

		System.out.println(
				"Program 4: [15 mins]\r\n" + "Print count of each vowels in a given String Array using switch case.");
		assignment28_Prog4.printCountOfEachVowel(input);

	}

}
