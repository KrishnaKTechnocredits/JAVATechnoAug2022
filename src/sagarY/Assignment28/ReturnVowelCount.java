/*Program 1 :Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4
*/

package sagarY.Assignment28;

public class ReturnVowelCount {

	int returnVowelCount(String input) {
		int count = 0;
		input = input.toLowerCase();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {

			case 'a':
				count++;
				break;

			case 'e':
				count++;
				break;

			case 'i':
				count++;
				break;

			case 'o':
				count++;
				break;

			case 'u':
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Program 1 : Return count of vowels in a given String using switch case.");
		System.out.println("************************************************************");
		String input = "TechnOcredits";
		System.out.println("Given String to count vowels: " + input);
		int count = new ReturnVowelCount().returnVowelCount(input);
		System.out.println("Output: \nCount of the vowels from string is " + ":" + count);
	}
}
