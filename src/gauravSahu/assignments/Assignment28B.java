/* Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e 
*/

package gauravSahu.assignments;

public class Assignment28B {

	char getFirstVowels(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a': {
				return ch;
			}
			case 'e': {
				return ch;
			}
			case 'i': {
				return ch;
			}
			case 'o': {
				return ch;
			}
			case 'u': {
				return ch;
			}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment28B a28 = new Assignment28B();
		String input = "technocredits";
		char ch = a28.getFirstVowels(input);
		System.out.println("First vowels of given string " + input + " is " + ch);
	}
}
