package sohail.stringprograms;

//Return first vowel from given String.
//input : technocredits
//outout : e

public class FirstVowelSwitchCase {
	char getVowelsCount(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
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
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		String input = "TechnOcredits";
		FirstVowelSwitchCase firstVowel = new FirstVowelSwitchCase();
		System.out.println("Given String is: " + input);
		firstVowel.getVowelsCount(input);
		char ch = firstVowel.getVowelsCount(input);
		System.out.println("First Vowels is: " + ch);
	}
}
