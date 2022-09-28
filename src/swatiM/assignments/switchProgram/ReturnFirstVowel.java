package swatiM.assignments.switchProgram;
/*Assignment - 28 : 25th Sep'2022

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e */

public class ReturnFirstVowel {

	char getFirstVowel(String input) {
		// int count = 0;
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
				break;

			}

		}
		return 0;
	}

	public static void main(String[] args) {
		ReturnFirstVowel assignment28_Prog2 = new ReturnFirstVowel();

		String input = "TechnOcredits";
		char ch = assignment28_Prog2.getFirstVowel(input);
		System.out.println("Program 2 : [10 mins]\r\n" + "Return first vowel from given String.");
		System.out.println("\nFirst vowels of string is --> " + "\nInput -  " + input + "\nOutput - " + ch);

	}

}
