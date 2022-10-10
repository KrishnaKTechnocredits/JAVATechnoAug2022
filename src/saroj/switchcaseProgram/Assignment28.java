package saroj.switchcaseProgram;

public class Assignment28 {

	int getCountOfVowel(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
				break;
			}
		}
		return count;
	}

	char getFirstVowel(String input) {
		char ch = input.charAt(0);
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
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
		return ch;
	}

	void getCountVowelString(String input) {
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				countA++;
				break;
			case 'e':
			case 'E':
				countE++;
				break;
			case 'i':
			case 'I':
				countI++;
				break;
			case 'o':
			case 'O':
				countO++;
				break;
			case 'u':
			case 'U':
				countU++;
				break;
			}
		}
		if (countA != 0)
			System.out.println("Count of a: " + countA);
		if (countE != 0)
			System.out.println("Count of e: " + countE);
		if (countI != 0)
			System.out.println("Count of i: " + countI);
		if (countO != 0)
			System.out.println("Count of o: " + countO);
		if (countU != 0)
			System.out.println("Count of u: " + countU);
	}

	void countOfEachVowel(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String word = input[index];
			int countA = 0;
			int countE = 0;
			int countI = 0;
			int countO = 0;
			int countU = 0;
			for (int index1 = 0; index1 < word.length(); index1++) {
				char ch = word.charAt(index1);
				switch (ch) {
				case 'a':
				case 'A':
					countA++;
					break;
				case 'e':
				case 'E':
					countE++;
					break;
				case 'i':
				case 'I':
					countI++;
					break;
				case 'o':
				case 'O':
					countO++;
					break;
				case 'u':
				case 'U':
					countU++;
					break;
				}
			}
			System.out.println("Vowel count in " + word + " : ");
			if (countA != 0)
				System.out.println(" a-> " + countA);
			if (countE != 0)
				System.out.println(" e-> " + countE);
			if (countI != 0)
				System.out.println(" i-> " + countI);
			if (countO != 0)
				System.out.println(" o-> " + countO);
			if (countU != 0)
				System.out.println(" u-> " + countU);
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String str = "TechnOcredits";
		int count = assignment28.getCountOfVowel(str);
		System.out.println("In " + str + ": Total count of vowels are: " + count);
		System.out.println("======================================");
		String str1 = "technocredits";
		char ch = assignment28.getFirstVowel(str1);
		System.out.println("In " + str1 + ": first vowels is: " + ch);
		System.out.println("=======================================");
		assignment28.getCountVowelString(str1);
		System.out.println("=======================================");
		String[] strArr = { "technocredits", "swati", "aashvi" };
		assignment28.countOfEachVowel(strArr);
	}
}
