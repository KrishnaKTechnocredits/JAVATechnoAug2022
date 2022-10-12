/*
Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom
*/

package deepakPatil.Assignment31PalindromeString;

public class Assignment31_2 {
	//Code to find if string is pallindrom by String.charAt method

	String findIfStringIsPallindrom(String input) {
		boolean flag = true;
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				flag = false;
				break;
			}
		}

		if (flag)
			return ("Given input string '" + input + "' is pallindrom string");
		else
			return ("Given input string '" + input + "' is not pallindrom string");
	}
	

	public static void main(String[] args) {
		Assignment31_2 assignment31_2 = new Assignment31_2();
		System.out.println("This code is to find if string is pallindrom by using reverse string method\n");

		String input1 = "radar";
		System.out.println("Given input string is: " + input1);
		System.out.println(assignment31_2.findIfStringIsPallindrom(input1));
		System.out.println("--------------------------------------------------------------");

		String input2 = "aabcbaa";
		System.out.println("Given input string is: " + input2);
		System.out.println(assignment31_2.findIfStringIsPallindrom(input2));
		System.out.println("--------------------------------------------------------------");

		String input3 = "abcabc";
		System.out.println("Given input string is: " + input3);
		System.out.println(assignment31_2.findIfStringIsPallindrom(input3));
		System.out.println("--------------------------------------------------------------");
	}
}
