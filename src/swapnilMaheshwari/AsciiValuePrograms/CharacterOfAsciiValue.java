/*
 WAP to Return character holding given Ascii value.
input : 69
output : E
 */

package swapnilMaheshwari.AsciiValuePrograms;

import java.util.Scanner;

public class CharacterOfAsciiValue {

	char getCharacterOfAsciiValue(int ascValue) {
		char ch = 0;
		if (ascValue >= 65 && ascValue <= 122) {
			ch = (char) ascValue;
		} else
			System.out.println("Invalid Ascii number");
		return ch;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Ascii value");
		int ascNumber = scanner.nextInt();
		char ch = new CharacterOfAsciiValue().getCharacterOfAsciiValue(ascNumber);
		System.out.println(ascNumber + " ->" + ch);

	}
}
