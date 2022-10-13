/*Program 5 : 
Return character holding given Ascii value.
input : 69
output : E*/

package manjiri.assignment36;

public class CharacterOfGivenAsciiValue {
	
	char asciiToCharacter(int asciiValue) {
		char ch = (char)asciiValue; //Ascii to char conversion
		return ch;
	}
	
	
	public static void main(String[] args) {
		int input = 69;
		System.out.println("Character having ascii value "+input+" is: " + new CharacterOfGivenAsciiValue().asciiToCharacter(input));
	}
}
