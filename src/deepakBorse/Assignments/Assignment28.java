/*Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
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

package deepakBorse.Assignments;

class Assignment28 {
//Return count of vowels in a given String using switch case.
	int getVowelcount(String input) {
		int countvowel = 0;
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {

			case 'a':
				countvowel++;
				break;

			case 'e':
				countvowel++;
				break;

			case 'i':
				countvowel++;
				break;

			case 'o':
				countvowel++;
				break;

			case 'u':
				countvowel++;
				break;

			default:
				break;
			}
		}
		return countvowel;
	}

//Return first vowel from given String.
	char getfirstVowel(String input) {
		char ch = 0;
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
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
		return ch;
	}

//Print count of each vowels in a given String using switch case.
	void printeachVowelcount(String input) {
		char ch = 0;
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		String input1 = input.toLowerCase(); // Convert the String to lower case
		for (int index = 0; index < input1.length(); index++) {
			ch = input1.charAt(index);
			switch (ch) {

			case 'a':
				countA++; // increment the countA if 'a' is found
				break;

			case 'e':
				countE++;// increment the countE if 'e' is found
				break;

			case 'i':
				countI++;// increment the countI if 'i' is found
				break;

			case 'o':
				countO++;// increment the countO if 'o' is found
				break;

			case 'u':
				countU++; // increment the countU if 'u' is found
				break;

			default:
				break;
			}

		}
		System.out.println("vowel count in '" + input + "':");//Print original String 
		if (countA > 0) {
			System.out.println("a -> " + countA);
		}
		if (countE > 0) {
			System.out.println("e -> " + countE);
		}
		if (countI > 0) {
			System.out.println("i -> " + countI);
		}
		if (countO > 0) {
			System.out.println("o -> " + countO);
		}
		if (countU > 0) {
			System.out.println("u -> " + countU);
		}

	}

//Print count of each vowels in a given String Array using switch case.
	void printeachVowelCountArry(String[] input) {

		for (int index = 0; index < input.length; index++) {
			printeachVowelcount(input[index]);// reuse the existing method to get vowel count of the string
		}
	}

	public static void main(String[] args) {
		Assignment28 Assignment = new Assignment28();

		String input = ("TechnOcredits");

		int vowelcount = Assignment.getVowelcount(input);
		System.out.println("Vowel count in string '" + input + "' is:" + vowelcount);// Count of Vowels

		String input2 = ("technocredits");

		char ch = Assignment.getfirstVowel(input);
		System.out.println("First Vowel in string '" + input2 + "' is:" + ch);// Return first vowel

		Assignment.printeachVowelcount(input2); // Method call to print each vowels from string

		String[] strarry = { "Omiuniversal", "swati", "AashvI" };
		Assignment.printeachVowelCountArry(strarry);

	}
}