/*Return first vowel from given String.

input : technocredits
outout : e*/

package smitaVetal.Assignment20_30;

public class Assignment28_Prog2 {

	char getFirstVowel(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				return ch;
			case 'A':
				return ch;
			case 'e':
				return ch;
			case 'E':
				return ch;
			case 'i':
				return ch;
			case 'I':
				return ch;
			case 'o':
				return ch;
			case 'O':
				return ch;
			case 'u':
				return ch;
			case 'U':
				return ch;
			}
		}
		return ' ';
	}

	public static void main(String[] args) {
		Assignment28_Prog2 prog2 = new Assignment28_Prog2();
		String input = "Smita";
		System.out.println("Given String is : " + input);
		char ch = prog2.getFirstVowel(input);
		System.out.println("First vowel in given string is : " + ch);

	}
}
