/*Assignment - 28 : 25th Sep'2022

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1*/

package rashmiG.switchCaseAssignment28;

class CountOfEachVowels {

	void printCountOfEachVowels(String input) {
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'A':
			case 'a':
				countA++;
				break;
			case 'E':
			case 'e':
				countE++;
				break;
			case 'I':
			case 'i':
				countI++;
				break;
			case 'O':
			case 'o':
				countO++;
				break;
			case 'U':
			case 'u':
				countU++;
				break;
			}
		}
		System.out.println(input);
		if (countA > 0)
			System.out.println("a -> " + countA);
		if (countE > 0)
			System.out.println("e -> " + countE);
		if (countI > 0)
			System.out.println("i -> " + countI);
		if (countO > 0)
			System.out.println("o -> " + countO);
		if (countU > 0)
			System.out.println("e -> " + countU);
		if (countA <= 0 && countE <= 0 && countI <= 0 && countO <= 0 && countU <= 0)
			System.out.println("No vowels present");

	}

	public static void main(String[] args) {
		CountOfEachVowels countOfEachVowels = new CountOfEachVowels();
		countOfEachVowels.printCountOfEachVowels("technocredits");
		countOfEachVowels.printCountOfEachVowels("RAsHmIe");
		countOfEachVowels.printCountOfEachVowels("879yb");

	}
}