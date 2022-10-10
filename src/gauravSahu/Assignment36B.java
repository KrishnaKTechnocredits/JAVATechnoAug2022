/*Program 2 : WAP to return ascii of given character.
input : C
output : 67
*/
package gauravSahu;

import java.util.Scanner;

public class Assignment36B {
	
	int getAsciiValue(String input) {
		char ch = input.charAt(0);
		int ascii = ch;
		return ascii;
	}
	
	public static void main(String[] args) {
		Assignment36B a36 = new Assignment36B();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Character : ");
		String input = sc.next();
		int output = a36.getAsciiValue(input);
		
		System.out.println("Ascii  Value of given character " + "is " + output);
	}

}
