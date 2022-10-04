/*
 * Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram
 */
package harshalRane.Assignments.assignment34;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	void checkAnagramString(String input1, String input2) {

		int length1 = input1.length();
		int length2 = input2.length();

		// check if length is same
		if (length1 == length2) {

			// convert strings to char array
			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();

			// sort the char array
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.toString(arr1).equals(Arrays.toString(arr2));

			if (result) {
				System.out.println("Result: "+"\""+input1+"\"" + " and " +"\""+ input2 +"\""+ " --> are Anagram");
			} else {
				System.out.println("Result: "+"\""+input1 +"\""+ " and " +"\""+ input2 +"\""+ " --> are not Anagram");
			}
		}
	}

	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Enter 2 Strings to check if they are Anagram ***");

		// take input from users
		System.out.println("Enter String 1:");
		String input1 = scanner.next();
		System.out.println("Enter String 2:");
		String input2 = scanner.next();

		AnagramString anagram = new AnagramString();
		anagram.checkAnagramString(input1, input2);
		
		scanner.close();
	}
}
