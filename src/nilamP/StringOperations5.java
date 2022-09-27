
/*Assignment - 28 : 25th Sep'2022

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
*/
package nilamP;

public class StringOperations5 {
	int getVowelCount(String str) {
		System.out.println("Program 1 output :");
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (Character.toLowerCase(str.charAt(i))) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;

			}
		}
		return count;
	}

	char getFirstVowel(String str) {
		System.out.println("Program 2 output :");
		for (int i = 0; i < str.length(); i++) {
			switch (Character.toLowerCase(str.charAt(i))) {
			case 'a':
				return 'a';

			case 'e':
				return 'e';
			case 'i':
				return 'i';
			case 'o':
				return 'o';
			case 'u':
				return 'u';

			}
		}
		return ' ';
	}

	void getEachVowelCount(String str) {
		System.out.println("Input String  : " + str);
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (Character.toLowerCase(str.charAt(i))) {
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
		if (counta > 0) {
			System.out.println("a -> " + counta);
		}
		if (counte > 0) {
			System.out.println("e -> " + counte);
		}
		if (counti > 0) {
			System.out.println("i -> " + counti);
		}
		if (counto > 0) {
			System.out.println("o -> " + counto);
		}
		if (countu > 0) {
			System.out.println("u -> " + countu);
		}
	}

	void getEachVowelCountArray(String[] input) {
	
		for (int i = 0; i < input.length; i++) {

			getEachVowelCount(input[i]);
		}

	}

	public static void main(String args[]) {
		StringOperations5 so = new StringOperations5();
		System.out.println("Vowel count in given String is : " + so.getVowelCount(" TechnOcredits"));
		System.out.println("First Vowel from given String is : " + so.getFirstVowel("technocredits"));
		System.out.println("Program 3 output :");
		System.out.println("Count of each vowel from given string");
		so.getEachVowelCount("technocredits");
		String[] input = { "technocredits", "swati", "aashvi" };
		System.out.println("Program 4 output :");
		System.out.println("count of each vowel in given Array :");
		so.getEachVowelCountArray(input);
	}
}
