/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram*/
package adittyThakare.stringoperations;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34_Program1 {

	// Method to check if 2 strings are anagram of each other
	void checkAnagram(String str1, String str2) {
		int strLength1 = str1.length();
		int strLength2 = str2.length();

		if (strLength1 == strLength2) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.toString(charArray1).equals(Arrays.toString(charArray2));

			if (result) {
				System.out.println("\nStrings " + str1 + " and " + str2 + " are anagram of each other!");
			} else {
				System.out.println("\nStrings " + str1 + " and " + str2 + " are not anagram of each other!");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Check if two strings are anagram of each other!");
		System.out.println("\nEnter String1: ");
		String str1 = scanner.next();
		System.out.println("\nEnter String2: ");
		String str2 = scanner.next();

		Assignment34_Program1 assignment34_Program1 = new Assignment34_Program1();
		assignment34_Program1.checkAnagram(str1, str2);

		scanner.close();
	}

}
