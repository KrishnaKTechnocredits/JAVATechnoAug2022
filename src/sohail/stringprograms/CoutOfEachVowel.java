package sohail.stringprograms;

//Program 3: [15 mins]
//Print count of each vowels in a given String using switch case.
//input : technocredits
//output : e -> 2
//       o -> 1
//		 i -> 1
public class CoutOfEachVowel {
	static void getCount(String input) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		input = input.toLowerCase();
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
		System.out.println("a: " + countA);
		System.out.println("e: " + countE);
		System.out.println("i: " + countI);
		System.out.println("o: " + countO);
		System.out.println("u: " + countU);
	}

	public static void main(String[] args) {
		String input = "teEchnocArediats";
		System.out.println("Given String is: " + input);
		CoutOfEachVowel.getCount(input);
	}
}
