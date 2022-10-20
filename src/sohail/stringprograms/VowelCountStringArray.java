//Program 4: [15 mins]
//Print count of each vowels in a given String Array using switch case.
//input : {"technocredits", "swati", "aashvi"}
//output : vowel count in technocredits:
//		 e -> 2
//       o -> 1
//		 i -> 1
//		 vowel count in swati:
//		 a -> 1
//       i -> 1
//		 vowel count inss aashvi:
//		 a -> 2
//       i -> 1
package sohail.stringprograms;

public class VowelCountStringArray {
	void getCount(String[] input) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		for (int outerIndex = 0; outerIndex < input.length; outerIndex++) {
			System.out.println(input[outerIndex]);
			char[] charArray = input[outerIndex].toCharArray();
			for (int innerIndex = 0; innerIndex < charArray.length; innerIndex++) {
				char ch = charArray[innerIndex];
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
					countO++;
					break;
				}
			}
			System.out.println("Count of A ->" + countA);
			System.out.println("Count of E ->" + countE);
			System.out.println("Count of I ->" + countI);
			System.out.println("Count of I ->" + countO);
			System.out.println("Count of U ->" + countU);
			System.out.println("------------------");
		}

	}

	public static void main(String[] args) {
		String[] input = { "technocredits", "swati", "aashvi" };
		VowelCountStringArray vowelcountstringarray = new VowelCountStringArray();
		vowelcountstringarray.getCount(input);

	}

}
