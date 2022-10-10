/* Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1 
*/
package gauravSahu;

import java.util.Arrays;

public class Assignment28D {

	void getVowels(String name) {
		System.out.println("Given string name in array : " + name);
		int counta = 0;
		int counte = 0;
		int counti = 0;
		int counto = 0;
		int countu = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;
			}
		}
		if (counta > 0)
			System.out.println('a' + "=" + counta);
		if (counte > 0)
			System.out.println('e' + "=" + counte);
		if (counti > 0)
			System.out.println('i' + "=" + counti);
		if (counto > 0)
			System.out.println('o' + "=" + counto);
		if (countu > 0) {
			System.out.println('u' + "=" + countu);
		}
	}

	public static void main(String[] args) {
		Assignment28D a28 = new Assignment28D();
		String[] input = { "technocredits", "swati", "aashvi" };
		System.out.println("Given array String  : "  + Arrays.toString(input));
		for (String name : input) {
			a28.getVowels(name);
		}
	}

}
