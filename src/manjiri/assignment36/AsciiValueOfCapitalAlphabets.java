/*Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/

package manjiri.assignment36;

public class AsciiValueOfCapitalAlphabets {
	
	public static void main(String[] args) {
		
		AsciiOfGivenChar ascii = new AsciiOfGivenChar();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiValue = ascii.charToAscii(ch);
			System.out.println(ch + "--> " + asciiValue);
		}
	}
}
