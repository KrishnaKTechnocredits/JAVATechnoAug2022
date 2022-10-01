package swatiM.assignments.switchProgram;
/*Assignment - 28 : 25th Sep'2022

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : TechnOcredIt
output : e -> 2
         o -> 1
		 i -> 1 */

public class PrintCountOfVowels {

	void printCountOfVowel(String input) {
		input = input.toLowerCase();
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
		PrintCountOfVowels assignment28_Prog3 = new PrintCountOfVowels();

		String input = "TechnOcredits";

		System.out.println("Program 3: [15 mins]\r\n"
				+ "Print count of each vowels in a given String using switch case.");
		System.out.println("Vowel count in --  " + input + " : ");
		assignment28_Prog3.printCountOfVowel(input);

	}

}
