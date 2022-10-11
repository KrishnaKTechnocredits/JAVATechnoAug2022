/*Assignment - 31 :

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

package apurvaBabel.Assignment31to40;

import java.util.Arrays;

public class Assignment31_PallindromeWords {

	// Method to find whether given string is pallindrome
	boolean isPallindrome(String word) {
		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	void printPallindrome(String word) {
		if (isPallindrome(word)) {
			System.out.println(word + " is a pallindrom word.");
		} else {
			System.out.println(word + " is not a pallindrom word.");
		}
	}

	// Method to print all pallindrome words from given array
	void printPallindrome(String[] input) {
		System.out.println("\nInput Array : " + Arrays.toString(input));
		System.out.println("Pallindrome words from given array are : ");
		for (String name : input) {
			if (isPallindrome(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		Assignment31_PallindromeWords assignment31 = new Assignment31_PallindromeWords();
		assignment31.printPallindrome("radar");
		assignment31.printPallindrome("aabcbaa");
		assignment31.printPallindrome("abcabc");

		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		assignment31.printPallindrome(input);
	}
}
