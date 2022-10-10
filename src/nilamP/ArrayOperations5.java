
/*Assignment - 31 : 29th Sep'2022

Program 1 :
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
         madam*/
package nilamP;

import java.util.Arrays;

public class ArrayOperations5 {
	void CheckPlaindrome(String input) {

		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		if (input.equals(output)) {
			System.out.println(output + " is palindrome");
		} else
			System.out.println(output + " is not palindrome");
	}

	void getPalindrome(String[] input) {
		for (int i = 0; i < input.length; i++) {
			CheckPlaindrome(input[i]);
		}
	}

	public static void main(String[] args) {
		ArrayOperations5 ao = new ArrayOperations5();
		System.out.println("Program 1 output :");
		ao.CheckPlaindrome("radar");
		ao.CheckPlaindrome("aabcbaa");
		ao.CheckPlaindrome("abcabc");
		System.out.print(" \n Program 2 output : \n");
		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("input: " + Arrays.toString(input));
		ao.getPalindrome(input);
	}
}
