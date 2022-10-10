/*
 * Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package swatiM.assignment;

import java.util.Arrays;

public class Assignment31_ArrayPallindrome {

	//Method to check whether String is Palindrome
			boolean isPalindrome(String str) {
				boolean palindromeflag = true;
				for (int i = 0, j = str.length() - 1; i < j; i++, j--) { 
					if (str.charAt(i) != str.charAt(j)) {
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
				Assignment31_ArrayPallindrome Prog = new Assignment31_ArrayPallindrome();
				String[] arr = { "radar", "techhpet", "madam", "maulikkilum" };
				System.out.println("Program to print all pallindrome input from given array.");
				System.out.println("\nInput String Array: " + Arrays.toString(arr));
				Prog.printAllPalindrmeStringsFromArray(arr);
			}

}
