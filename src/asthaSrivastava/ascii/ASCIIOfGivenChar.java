/*Program 2 : 
WAP to return ascii of given character.

input : C
output : 67
Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/

package asthaSrivastava.ascii;

public class ASCIIOfGivenChar {
	// method to return ascii value of given char
	int getAsciiofGivenChar(char ch) {
		int ascii = ch;
		System.out.println("ASCII Of given character " + ch + " -> " + ascii);
		return ascii;
	}

	// method to return ascii values of A-Z
	int getAsciiOfAllCapAlphabets(char ch) {
		int ascii = ch;
		System.out.println(ch + "--" + ascii);
		return ascii;
	}

	public static void main(String[] args) {
		new ASCIIOfGivenChar().getAsciiofGivenChar('C');
		System.out.println("\nASCII values from A to Z are :");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			new ASCIIOfGivenChar().getAsciiOfAllCapAlphabets(ch);
		}
		System.out.println("\n");
	}
}