/*
 * Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom

Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package harshalRane.Assignments.assignment31;

import java.util.Arrays;

public class Assignment31 {

	void checkPallindrome(String input) {

		// output variable to store reverse string
		String output = "";

		// loop to reverse the input String
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}

		// to check if input and output are equal
		if (input.equals(output))
			System.out.println(output + " is Pallindrome");
		else
			System.out.println(output + " is not Pallindrome");
	}
	
	void getPallindromeFromArray(String[] input) {
		//loop to iterate all names in input Array
		for(int index=0;index<input.length;index++) {
			checkPallindrome(input[index]);
		}
	}
	
	public static void main(String[] args) {
		new Assignment31().checkPallindrome("radar");
		new Assignment31().checkPallindrome("aabcbaa");
		new Assignment31().checkPallindrome("abcabc");
		System.out.println("----------------------------");
		
		String[] input = {"radar","techhpet","madam","maulikkilum"};
		System.out.println("Input String " +Arrays.toString(input) + "\n");
		new Assignment31().getPallindromeFromArray(input);
	}
}
