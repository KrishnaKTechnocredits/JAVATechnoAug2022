package vibhaS.Assignment;

public class Assignment28 {

	// Return count Of vowel in a given String using Switch case
	int getTotalCountOfVowel(String word) {
		int count = 0;
		String str = word.toUpperCase();
		;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'A':
				count++;
				break;
			case 'E':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'U':
				count++;
				break;
			default:
				break;
			}
		}
		return count;
	}

	// Return first vowel from given String
	char getFirstVowelInString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'A':
			case 'a':
				return ch;
			case 'E':
			case 'e':
				return ch;
			case 'I':
			case 'i':
				return ch;
			case 'O':
			case 'o':
				return ch;
			case 'U':
			case 'u':
				return ch;
			default:

			}
		}
		return ' ';
	}

	// Print count of each vowel in a given String using Switch case
	void printCountOfAllvowelInString(String str) {
		int Acount = 0;
		int Ecount = 0;
		int Icount = 0;
		int Ocount = 0;
		int Ucount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
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
		if (Acount > 0) {
			System.out.println("Total A count is => " + Acount);
		}
		if (Ecount > 0) {
			System.out.println("Total E count is => " + Ecount);
		}
		if (Icount > 0) {
			System.out.println("Total I count is => " + Icount);
		}
		if (Ocount > 0) {
			System.out.println("Total O count is => " + Ocount);
		}
		if (Ucount > 0) {
			System.out.println("Total U count is => " + Ucount);
		}

	}

	// Print count of each vowel in a given String Array using Switch Case
	void printVowelCount(String[] arr) {
		for (String str : arr) {
			System.out.println("Vowel count in " + str + " is");
			printCountOfAllvowelInString(str);
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		int ans = assignment28.getTotalCountOfVowel("TechnOcredits");
		System.out.println("Total count of vowel in String is " + ans);
		System.out.println("");
		char ans1 = assignment28.getFirstVowelInString("Technocredits");
		System.out.println("First vowel from given String " + ans1);
		System.out.println("");
		assignment28.printCountOfAllvowelInString("technocredits");
		System.out.println("");
		String str[] = { "technocredits", "swati", "aashvi" };
		assignment28.printVowelCount(str);
	}
}
