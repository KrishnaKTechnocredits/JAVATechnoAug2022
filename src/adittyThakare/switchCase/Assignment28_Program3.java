/*Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1*/
package adittyThakare.switchCase;

public class Assignment28_Program3 {

	void printEachVowelCountInString(String str) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

		for (int index = 0; index < str.length(); index++) { // Iterate loop till string length
			char ch = str.charAt(index); // Get character at index position of string

			switch (ch) { // Switch case to check lowecase and uppercase vowels, if case satisfied
							// increase count and break;
			case 'a':
			case 'A':
				aCount++;
				break;
			case 'e':
			case 'E':
				eCount++;
				break;
			case 'i':
			case 'I':
				iCount++;
				break;
			case 'o':
			case 'O':
				oCount++;
				break;
			case 'u':
			case 'U':
				oCount++;
				break;
			}
		}
		System.out.println("\nInput String: " + str);
		// If each type of vowel count greater than 0 then print that count
		if (aCount > 0)
			System.out.println("a -> " + aCount);
		if (eCount > 0)
			System.out.println("e -> " + eCount);
		if (iCount > 0)
			System.out.println("i -> " + iCount);
		if (oCount > 0)
			System.out.println("o -> " + oCount);
		if (uCount > 0)
			System.out.println("u -> " + uCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment28_Program3 assignment28_Program3 = new Assignment28_Program3();
		String str = "TechnOcredits";
		System.out.println("Program to print count of each vowels in a given String using switch case");
		assignment28_Program3.printEachVowelCountInString(str);
	}

}
