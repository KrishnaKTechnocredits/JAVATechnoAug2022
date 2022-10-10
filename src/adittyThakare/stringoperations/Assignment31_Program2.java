/*Assignment - 31 : 29th Sep'2022
Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/
package adittyThakare.stringoperations;

import java.util.Arrays;

public class Assignment31_Program2 {
	
	//Method to check whether String is Palindrome
	boolean isPalindrome(String str) {
		boolean palindromeflag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) { // Iterate For loop such that 1st character and last character of String is checked and so on until both character index position is not same
			if (str.charAt(i) != str.charAt(j)) { //If character at i and j position are not same, String not a palindrome
				palindromeflag = false;
				break;
			}
		}
		return palindromeflag;
	}

	void printAllPalindrmeStringsFromArray(String[] arr) {
		System.out.println("Output Palindrome Strings: ");
		for (int index = 0; index < arr.length; index++) {
			if (isPalindrome(arr[index])) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31_Program2 assignment31_Program2 = new Assignment31_Program2();
		String[] arr = { "radar", "techhpet", "madam", "maulikkilum" };

		System.out.println("Program to print all pallindrome input from given array.");
		System.out.println("\nInput String Array: " + Arrays.toString(arr));
		assignment31_Program2.printAllPalindrmeStringsFromArray(arr);
	}

}
