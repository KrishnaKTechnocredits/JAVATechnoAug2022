/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/
package maheshSantoki.SwitchCase;

import java.util.Arrays;

public class Vowels {
	// count vowels in given string :
	int getVowels(String input) {
		int count = 0;
		input = input.toLowerCase();// convert into Lowercase :
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);// find a character at index
			switch (ch) {// using switch case find vowels
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

			default:
				break;
			}
		}
		return count;
	}

	/*
	 * Program 2 : [10 mins] Return first vowel from given String.
	 * 
	 * input : technocredits outout : e
	 */
	char getFirstVowel(String input) {
		int count = 0;
		input = input.toLowerCase();// convert into Lowercase :
		char ch1 = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);// find a character at index
			switch (ch) {// using switch case find vowels
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

//	Program 3: [15 mins]
//			Print count of each vowels in a given String using switch case.
//
//			input : technocredits
//			output : e -> 2
//			         o -> 1
//					 i -> 1
//					 	
	void getCountOfEachVowels(String input) {
		input = input.toLowerCase();
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		System.out.println("Number of each vowels in given string :" + input);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;

			}
		}
		if (counta > 0)
			System.out.println('a' + "-->" + counta);
		if (counte > 0)
			System.out.println('e' + "-->" + counte);
		if (counti > 0)
			System.out.println('i' + "-->" + counti);
		if (counto > 0)
			System.out.println('o' + "-->" + counto);
		if (countu > 0)
			System.out.println('u' + "-->" + countu);
	}

//	Program 4:Print count of each vowels in a given String Array using switch case.
//          input : {"technocredits", "swati", "aashvi"}
//			output : vowel count in technocredits:
//					 e -> 2
//			         o -> 1
//					 i -> 1
//					 vowel count in swati:
//					 a -> 1
//			         i -> 1
//					 vowel count in aashvi:
//					 a -> 2
//			         i -> 1
	void getCountOfVowelsFromArray(String[] input) {
		System.out.println("Given String Array  :" + Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			getCountOfEachVowels(input[i]);
		}
	}

	public static void main(String[] args) {
		String input = "TechnOcredits";
		Vowels vowels = new Vowels();

		System.out.println(vowels.getVowels(input) + " : Vowels in " + input);
		System.out.println("==========================================================================");
		
		System.out.println(vowels.getFirstVowel(input) + " : is First Vowel in " + input);
		System.out.println("==========================================================================");
		
		vowels.getCountOfEachVowels(input);
		System.out.println("==========================================================================");
		
		String str[] = { "technocredits", "swati", "aashvi" };
		vowels.getCountOfVowelsFromArray(str);
		System.out.println("==========================================================================");

	}
}
