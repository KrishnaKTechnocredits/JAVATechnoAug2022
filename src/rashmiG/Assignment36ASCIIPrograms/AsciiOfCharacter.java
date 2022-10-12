/*Assignment - 36 : 9th Oct'2022

Program 2 : 
WAP to return ascii of given character.

input : C
output : 67*/

package rashmiG.Assignment36ASCIIPrograms;

public class AsciiOfCharacter {

	private int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}

	public void display(char ch) {
		System.out.println(ch + " --> " + getAsciiOfChar(ch));
	}

	public static void main(String[] args) {
		AsciiOfCharacter ascii = new AsciiOfCharacter();
		ascii.display('C');
		ascii.display('0');
	}
}
