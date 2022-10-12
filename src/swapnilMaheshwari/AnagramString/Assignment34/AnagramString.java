/*
 Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

 */

package swapnilMaheshwari.AnagramString.Assignment34;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	// boolean flag;
	boolean anagramWithSorting(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		// 2nd way
		// System.out.println(Arrays.toString(ch1).equals(Arrays.toString(ch2)));
		// return true;
		// 3rd way
		for (int index = 0; index < ch1.length; index++) {
			if (ch1[index] != ch2[index])
				return false;
		}
		return true;
	}

	void isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			System.out.println("Not a Anagram String");
		else {
			while (str1.length() > 0) {
				char ch = str1.charAt(0);
				str1 = str1.replaceFirst(String.valueOf(ch), "");
				str2 = str2.replaceFirst(String.valueOf(ch), "");
			}
			if (str1.length() == str2.length())
				System.out.println("Anagram String");
			else
				System.out.println("Not a Anagram String1");
		}
	}

	public static void main(String[] args) {
		String st = "CATC";
		String st1 = "ACTC";
		boolean flag = new AnagramString().anagramWithSorting(st, st1);
		if (flag)
			System.out.println("Given String is Anagram");
		else
			System.out.println("Given String is not a Anagram");
		Scanner src = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = src.next();
		System.out.println("Enter the String 2");
		String str2 = src.next();
		new AnagramString().isAnagram(str1, str2);
	}
}
