/*Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
*/

package sagarY.Assignment28;

public class ReturnEachVowelCount {

	void printEachVowelCount(String input) {
		int countA=0; int countE=0; int countI=0; int countO=0; int countU=0;
		input = input.toLowerCase();

		for (int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);

			switch (ch1) {

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
		if(countA>0)
		System.out.println("a"+"--> "+countA);
		if(countE>0)
		System.out.println("e"+"--> "+countE);
		if(countI>0)
		System.out.println("i"+"--> "+countI);
		if(countO>0)
		System.out.println("o"+"--> "+countO);
		if(countU>0)
		System.out.println("u"+"--> "+countU);

	}

	public static void main(String[] args) {
		System.out.println("Program 3 : Print count of each vowels in a \ngiven String using switch case.");
		System.out.println("******************************************");
		String input = "TechnOcredits";
		System.out.println("Given String to count vowels: " +input);
		System.out.println("Count of each vowel:");
		new ReturnEachVowelCount().printEachVowelCount(input);
	}
}
