//WAP to return ascii of given character.

package vinod.Assignment;

import java.util.Scanner;

public class Assign36A {
	int getAsciiValue (String input) {
		char ch = input.charAt(0);
		int ascii = ch;
		return ascii;
	}
	public static void main(String[] args) {
		Assign36A assign36A = new Assign36A();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Character : ");
		String input = sc.next();
		int output = assign36A.getAsciiValue(input);
		System.out.println("Ascii Value of given character " + "is" + output);
	}

}
