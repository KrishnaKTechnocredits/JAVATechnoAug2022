/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/

package gauravSahu;

public class Assignment28A {

	int getVowels(String name) {
		String name2 = name.toLowerCase();
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name2.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}return count;
	}

	public static void main(String[] args) {
		Assignment28A a28 = new Assignment28A();
		String input = "TechnOcredits";
		int count = a28.getVowels(input);
		System.out.println("No. of Vowels in  " + input + " >>> " + count);
	}

}
