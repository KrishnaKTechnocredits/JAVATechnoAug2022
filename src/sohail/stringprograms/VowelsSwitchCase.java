package sohail.stringprograms;

//Assignment - 28 : 25th Sep'2022
//Program 1 : [10 mins - 13 mins]
//Return count of vowels in a given String using switch case.
//input : TechnOcredits
//output : 4

public class VowelsSwitchCase {
	void getVowelsCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
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
			}

		}
		System.out.println("Count of Vowels is: " + count);
	}

	public static void main(String[] args) {
		String input = "TechnOcredits";
		VowelsSwitchCase vowelsswitchcase = new VowelsSwitchCase();
		System.out.println("Given String is: " + input);
		vowelsswitchcase.getVowelsCount(input);
	}
}

