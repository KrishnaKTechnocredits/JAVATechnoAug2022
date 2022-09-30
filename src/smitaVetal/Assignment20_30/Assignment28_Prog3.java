/*Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1*/

package smitaVetal.Assignment20_30;

public class Assignment28_Prog3 {

	void getCountOfVowels(String name) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);

			switch (ch) {
			case 'a':
			case 'A':
				count1++;
				break;

			case 'e':
			case 'E':
				count2++;
				break;

			case 'i':
			case 'I':
				count3++;
				break;

			case 'o':
			case 'O':
				count4++;
				break;

			case 'u':
			case 'U':
				count5++;
				break;
			}
		}
		if (count1 > 0)
			System.out.println("Counts of vowel A is : " + count1);
		if (count2 > 0)
			System.out.println("Counts of vowel E is : " + count2);
		if (count3 > 0)
			System.out.println("Counts of vowel I is : " + count3);
		if (count4 > 0)
			System.out.println("Counts of vowel O is : " + count4);
		if (count5 > 0)
			System.out.println("Counts of vowel U is : " + count5);

	}

	public static void main(String[] args) {
		Assignment28_Prog3 program3 = new Assignment28_Prog3();
		String input = "TechnOcredits";
		System.out.println("Given string is : " + input);
		program3.getCountOfVowels(input);

	}
}
