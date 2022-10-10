/*Assignment - 36 : 9th Oct'2022

Program 5 : 
Return character holding given Ascii value.

input : 69
output : E*/

package rashmiG.Assignment36ASCIIPrograms;

public class FetchCharacterFromGivenAscii {

	char getCharFromAscii(int ascii) {
		char ch = (char) ascii;
		// char ch1 =69;
		return ch;
	}

	public static void main(String[] args) {
		FetchCharacterFromGivenAscii fetch = new FetchCharacterFromGivenAscii();
		// char ch =69;
		int ch = 69;
		int ch1 = 57;
		System.out.println(ch + " --> " + fetch.getCharFromAscii(ch));
		System.out.println(ch1 + " --> " + fetch.getCharFromAscii(ch1));
	}
}