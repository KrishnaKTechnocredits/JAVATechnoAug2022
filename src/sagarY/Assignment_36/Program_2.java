/*Program 2 : WAP to return ascii of given character.*/

package sagarY.Assignment_36;

import java.util.Scanner;

public class Program_2 {

	int returnAsciiValue(char ch) {
		int asciiValue = ch;

		return asciiValue;
	}

	public static void main(String[] args) {
		System.out.println("*Program 2 : WAP to return ascii of given character.");
		System.out.println("---------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Character: ");
		char ch = sc.nextLine().charAt(0);
		Program_2 prg = new Program_2();
		int asciiValue = prg.returnAsciiValue((char) ch);
		System.out.println("Ascii value of '" + ch + "' is: " + asciiValue);
	}
}
