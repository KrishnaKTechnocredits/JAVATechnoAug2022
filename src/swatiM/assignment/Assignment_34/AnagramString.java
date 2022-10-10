/*Assignment - 34 : 2nd Oct'2022
Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram*/

package swatiM.assignment.Assignment_34;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	void printAnagram1(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean isAnagramFlag = true;
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					isAnagramFlag = false;
				}
			}
			if (isAnagramFlag) {
				System.out.println("---- Given strings are Anagram ---- ");
			} else {
				System.out.println("---- Given strings are not Anagram ---- ");
			}
		} else {
			System.out.println("Given strings are not Anagram");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Program 1 : How to check if two given String is the anagram of each other (using scanner class)?");
		System.out.println("---------------------------------------");
		System.out.println("Enter 2 strings to check if they are Anagram or not");
		System.out.println("---------------------------------------");
		System.out.println("Enter string 1 : ");
		String str1 = scanner.next();
		System.out.println("Enter string 2 : ");
		String str2 = scanner.next();

		AnagramString anagramString = new AnagramString();
		anagramString.printAnagram1(str1, str2);

		scanner.close();
	}
}