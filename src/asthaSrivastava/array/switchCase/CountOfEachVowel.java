/*Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 */
package asthaSrivastava.array.switchCase;

public class CountOfEachVowel  {

	//to find count of each vowel from given input
	void printEachVowelCount(String input) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			switch (ch) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			default:
				break;
			}
		}
		if (aCount > 0)
			System.out.println('a' + "->" + aCount);
		if (eCount > 0)
			System.out.println('e' + "->" + eCount);
		if (iCount > 0)
			System.out.println('i' + "->" + iCount);
		if (oCount > 0)
			System.out.println('o' + "->" + oCount);
		if (uCount > 0)
			System.out.println('u' + "->" + uCount);
	}

	public static void main(String[] args) {
		CountOfEachVowel test = new CountOfEachVowel();
		test.printEachVowelCount("technocredits");
	}
}
