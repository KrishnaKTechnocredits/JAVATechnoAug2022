/*Program 5 : 69
Return character holding given Ascii value.

input : 69
output : E

Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 

*/
package asthaSrivastava.ascii;

public class AsciiToChar {

	// method to return character holding given ASCII value
	char getCharFromGivenAscii(int input) {
		char result = (char) input;
		System.out.println("Character of " + input + " is " + result);
		return result;
	}

	// method to print all character having ASCII value from 91 to 96
	void printCharacterOfGivenAscii(int ascii) {
		char temp = (char) ascii;
		System.out.println(ascii + "->" + temp);
	}

	public static void main(String[] args) {
		new AsciiToChar().getCharFromGivenAscii(69);
		System.out.println("\nCharacter having ASCII values from range 91 to 96 : ");
		for (char ch = 91; ch <= 96; ch++) {
			new AsciiToChar().printCharacterOfGivenAscii(ch);
		}
	}
}