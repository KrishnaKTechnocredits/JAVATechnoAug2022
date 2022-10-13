/*Program 2 : 
WAP to return ascii of given character.
input : C
output : 67*/

package manjiri.assignment36;

public class AsciiOfGivenChar {
	
	int charToAscii(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}
	
	public static void main(String[] args) {
		char inputChar = 'C';
		System.out.println("Ascii value of "+inputChar+" is: " + new AsciiOfGivenChar().charToAscii(inputChar));
	}

}
