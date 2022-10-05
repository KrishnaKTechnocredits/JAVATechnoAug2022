/*Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e*/
package asthaSrivastava.array.switchCase;

public class FirstVowel {

	// to find first vowel from String
	char printFirstVowel(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			switch (ch) {
			case 'a':
				return ch;
			case 'e':
				return ch;
			case 'i':
				return ch;
			case 'o':
				return ch;
			case 'u':
				return ch;
			default:
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		FirstVowel test = new FirstVowel();
		String str = "technocredits";
		char ch=	test.printFirstVowel(str);
		System.out.println("First vowel from given String is -> " +ch);

	}
}
