/*
 * Assignment - 31 : 29th Sep'2022

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
         madam
 */

package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment31 {

	boolean isPallindrome(String str) {
		// String revstr="";

		boolean palendromeflag = true;
		for (int index = 0, lastindex = str.length() - 1; index < lastindex; index++, lastindex--) {

			if (str.charAt(index) != str.charAt(lastindex)) {
				palendromeflag = false;
			}

		}
		return palendromeflag;

	}

	void printPallindromearry(String[] inputstr) {
		System.out.println("Input array " + Arrays.toString(inputstr));
		for (int index = 0; index < inputstr.length; index++) {
			boolean ispallindromeflag = isPallindrome(inputstr[index]);
			if (ispallindromeflag == true) {
				System.out.println(inputstr[index]);
			}
		}
	}

	void printPallindrome(String inputstr) {

		boolean ispallindromeflag = isPallindrome(inputstr);
		if (ispallindromeflag == true) {
			System.out.println("Stirng '" + inputstr + "' is palendrome");
		}
		else {
			System.out.println("Stirng '" + inputstr + "' is not palendrome");
		}
	}

	public static void main(String[] args) {

		Assignment31 Assignment = new Assignment31();

		String input1 = "radar";
		String input2 = "aabcbaa";
		String input3 = "abcabc";

		Assignment.printPallindrome(input1);
		Assignment.printPallindrome(input2);
		Assignment.printPallindrome(input3);

		String[] strarry = { "radar", "techhpet", "madam", "maulikkilum" };
		Assignment.printPallindromearry(strarry);
	}

}