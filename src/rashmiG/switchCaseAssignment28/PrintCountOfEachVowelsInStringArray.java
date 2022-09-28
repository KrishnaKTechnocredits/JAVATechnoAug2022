/*Assignment - 28 : 25th Sep'2022

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
}*/

package rashmiG.switchCaseAssignment28;

class PrintCountOfEachVowelsInStringArray {

	void printCountOfEachVowels(String input) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
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
		System.out.println("vowel count in " + input + ":");
		if (countA > 0)
			System.out.println("a -> " + countA);
		if (countE > 0)
			System.out.println("e -> " + countE);
		if (countI > 0)
			System.out.println("i -> " + countI);
		if (countO > 0)
			System.out.println("o -> " + countO);
		if (countU > 0)
			System.out.println("u -> " + countU);
		if (countA <= 0 && countE <= 0 && countI <= 0 && countO <= 0 && countU <= 0)
			System.out.println("No vowels present");
	}

	void printCountOfEachVowelsArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			this.printCountOfEachVowels(input[index]);
		}
	}

	public static void main(String[] args) {
		PrintCountOfEachVowelsInStringArray printCountOfVowels = new PrintCountOfEachVowelsInStringArray();
		String[] input = { "technocredits", "swati", "aashvi", "678kLI", "++=09)(hGfM" };
		printCountOfVowels.printCountOfEachVowelsArray(input);
	}
}