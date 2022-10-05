/*
 Assignment - 31 : 29th Sep'2022
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
         madam */

package pujaSah.assignments31_40;

import java.util.Arrays;

public class PallindromExample {

	// method to find whether given String is pallindrome.
	boolean isPallindrom(String str) {
		boolean flag = true;
		for (int index = 0, innerIndex = str.length() - 1; index < innerIndex
				&& innerIndex > index; index++, innerIndex--) {
			if (str.charAt(index) != str.charAt(innerIndex)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void displayResult(String str) {
		System.out.println("Input String: " + str);
		if (isPallindrom(str)) {
			System.out.println(str + " is Pallindron \n");
		} else {
			System.out.println(str + " is not pallindrom \n");
		}
	}

	// method to print all pallindrome input from given array.
	void displayArrayResult(String[] strArr) {
		System.out.println("Input Array: " + Arrays.toString(strArr));
		System.out.println("Pallindrom Strings are: ");
		for (String name : strArr) {
			if (isPallindrom(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		PallindromExample pallindromExample = new PallindromExample();

		pallindromExample.displayResult("radar");
		pallindromExample.displayResult("aabcbaa");
		pallindromExample.displayResult("abcabc");

		String[] inArr = { "radar", "techhpet", "madam", "maulikkilum" };
		pallindromExample.displayArrayResult(inArr);
	}
}
