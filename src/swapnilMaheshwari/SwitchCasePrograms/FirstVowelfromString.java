/*
Program  : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e


 */

package swapnilMaheshwari.SwitchCasePrograms;

public class FirstVowelfromString {
	char getFirstVowel(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'A':
				return 'A';
			case 'a':
				return 'a';
			case 'E':
				return 'E';
			case 'e':
				return 'e';
			case 'I':
				return 'I';
			case 'i':
				return 'i';
			case 'O':
				return 'O';
			case 'o':
				return 'o';
			case 'U':
				return 'U';
			case 'u':
				return 'u';
			default:
				break;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("First vowel in the string " + input + "->" + new FirstVowelfromString().getFirstVowel(input));
	}
}
