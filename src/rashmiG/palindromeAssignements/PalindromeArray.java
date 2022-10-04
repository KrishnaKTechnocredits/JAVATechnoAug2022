/*Assignment - 31 : 29th Sep'2022

Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/

package rashmiG.palindromeAssignements;

import java.util.Arrays;

class PalindromeArray {

	void printPalindromeStrings(String[] inputArray) {
		System.out.println("input : " + Arrays.toString(inputArray));
		System.out.print("Output : ");
		for (String str : inputArray) {
			boolean flag = isPalindrome(str);
			if (flag)
				System.out.println(str);
		}
	}

	boolean isPalindrome(String str) {
		for (int index = 0, innerIndex = str.length() - 1; index < innerIndex; index++, innerIndex--) {
			if (str.charAt(index) != str.charAt(innerIndex)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		PalindromeArray palindromeArray = new PalindromeArray();
		palindromeArray.printPalindromeStrings(input);
	}
}
