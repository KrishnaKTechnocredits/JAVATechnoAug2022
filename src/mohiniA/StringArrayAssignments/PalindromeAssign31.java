
/*********
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

 * ***********/

package mohiniA.StringArrayAssignments;

import java.util.Arrays;



public class PalindromeAssign31 {
	
	boolean isStringPalindrome(String input) {
		boolean flag = true;
		for (int index = 0, index1 = input.length() - 1; index < index1; index++, index1--) {
			if (input.charAt(index) != input.charAt(index1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void getAllPalindrome(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String word = input[index];
			boolean flag = isStringPalindrome(word);
			if (flag) {
				System.out.println(word + " is Palindrome");
			} else
				System.out.println(word + " is not Palindrome");
		}
	}

	public static void main(String[] args) {
		PalindromeAssign31 obj31 = new PalindromeAssign31();
		String str = "radar";
		boolean flag = obj31.isStringPalindrome(str);
		if (flag) {
			System.out.println(str + " is Palindrome");
		} else
			System.out.println(str + " is not Palindrome");
		System.out.println("=============================================");
		String[] str1 = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Given array is: " + Arrays.toString(str1));
		System.out.println("=============================================");
		obj31.getAllPalindrome(str1);
	}	

}
