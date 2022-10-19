package anujaD;

public class Assignment28_1 {

	int getCount(String str) {
		str = str.toLowerCase();
		int vowelsConut = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsConut++;
			}
		}
		return vowelsConut;
	}

	char getVowel(String str) {
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
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
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment28_1 assignment28_1 = new Assignment28_1();
		String input ="TechnOcredits";
		System.out.println("Given input string is :" + input);
		System.out.println("Vowels from given string is: " + assignment28_1.getCount(input));
		System.out.println("First ovel from given string is: " + assignment28_1.getVowel(input));
	}
}
