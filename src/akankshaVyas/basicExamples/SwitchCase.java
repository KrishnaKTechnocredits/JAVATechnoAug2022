/*
 * Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
		 
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
         i -> 1

int count = 0;
for(int index=0;index<str.length();index++){
	char ch = str.charAt(index);
	
	switch(ch){
		case 'a':
		case 'A':
			count++;
			break;	
	}
}
*/

package akankshaVyas.basicExamples;

public class SwitchCase {

	int getCountofVowel(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				count++;
				break;

			case 'e':
			case 'E':
				count++;
				break;
			case 'i':
			case 'I':
				count++;
				break;
			case 'o':
			case 'O':
				count++;
				break;
			case 'u':
			case 'U':
				count++;
				break;

			default:
				break;
			}

		}
		return count;
	}

	char getFirstofVowel(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				return ch;

			case 'e':
			case 'E':
				return ch;
			case 'i':
			case 'I':
				return ch;
			case 'o':
			case 'O':
				return ch;
			case 'u':
			case 'U':
				return ch;

			default:
				break;
			}
		}
		return ' ';
	}

	void printCountofEachVowel(String str) {
		System.out.println("\n"+"In the given string - " + str + " count of each vowel is :" );
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
				acount++;
				break;
			case 'e':
				ecount++;
				break;
			case 'i':
				icount++;
				break;
			case 'o':
				ocount++;
				break;
			case 'u':
				ucount++;
				break;
			default:
				break;
			}

		}
		if (acount > 0)
			System.out.println("a -->" + acount);
		if (ecount > 0)
			System.out.println("e -->" + ecount);
		if (icount > 0)
			System.out.println("i -->" + icount);
		if (ocount > 0)
			System.out.println("o -->" + ocount);
		if (ucount > 0)
			System.out.println("u -->" + ucount);
	}

	void printData(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			printCountofEachVowel(arr[index]);
		}

	}

	public static void main(String[] args) {
		SwitchCase switchCase = new SwitchCase();
		String str = "TechnOcreeeeedits";
		System.out.println("Total count of vowel in given string - \"" + str + "\" is - "
				+ switchCase.getCountofVowel(str) + "\n");
		System.out.println(
				"First vowel in given string - \"" + str + "\" is - " + switchCase.getFirstofVowel(str) + "\n");
		switchCase.printCountofEachVowel("technocredits");
		String[] arr = { "technocredits", "swati", "aashvi" };
		switchCase.printData(arr);
	}
}
