package nehaniG;

public class Assignment28 {
	int getCountOfVowels(String input) {
		input = input.toLowerCase();
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			}
		}

		return count;
	}

	char getFirstVowel(String input) {
		input = input.toLowerCase();
		int count = 0;
		char ch = input.charAt(0);
		for (int index = 0; index < input.length(); index++) {

			char ch1 = input.charAt(index);
			switch (ch1) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				ch = ch1;
				count++;
				break;
			}
			if (count == 1) {
				break;
			}
		}
		return ch;
	}

	void printCountOfEachVowel(String input) {
		System.out.println("Given String : " + input);
		input = input.toLowerCase();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
				countA++;
				break;
			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;
				break;
			case 'u':
				countU++;
				break;
			}
		}
		if (countA > 0)
			System.out.println("a" + "->" + countA);
		if (countE > 0)
			System.out.println("e" + "->" + countE);
		if (countI > 0)
			System.out.println("i" + "->" + countI);
		if (countO > 0)
			System.out.println("o" + "->" + countO);
		if (countU > 0)
			System.out.println("u" + "->" + countU);

	}

	void getVowelCountFromArrayString(String[] arr){
		for(int i = 0; i< arr.length; i++) {
			printCountOfEachVowel(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String input1 = "TechnOcredits";
		System.out.println("Total count of vowels from given String is --> " + assignment28.getCountOfVowels(input1));

		String input2 = "technocredits";
		System.out.println("First vowel in given String is --> " + assignment28.getFirstVowel(input2));

		String input3 = "technocredits";
		assignment28.printCountOfEachVowel(input3);
		
		String[] input4 = {"technocredits", "swati", "aashvi"};
		assignment28.getVowelCountFromArrayString(input4);

	}

}
