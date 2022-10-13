/*
 Program 2 : 
WAP to return ascii of given character.

input : C
output : 67

 */

package swapnilMaheshwari.AsciiValuePrograms;

import java.util.Scanner;

public class AsciiOfChar {
	int getAsciiOfChar(char ch) {
		int asc = ch;
		return asc;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter any character to know the Ascii value of it");
		System.out.print("Input: ");
		int asc = new AsciiOfChar().getAsciiOfChar(src.next().charAt(0));
		System.out.print("Output: ");
		System.out.println(+asc);
	}

}
