/*
 * Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
 */
package hindaviIngle;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34_anagramString {

//Method 1 using sort Array	
	boolean isAnagram(String str1, String str2) {
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		// another way
		// System.out.println(Arrays.toString(chr1).equals(Arrays.toString(chr2)));
		for (int index = 0; index < chr1.length; index++) {
			if (chr1[index] != chr2[index]) {
				return false;
			}
		}
		return true;

	}

//Method 2 using string replace method

	void isAnagramStr(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("String is not a Anagram");
		} else {
			while (str1.length() > 0) {
				char ch = str1.charAt(0);
				// char ch1=str1.charAt(0);
				// char ch1=str2.charAt(0);
				str1 = str1.replaceFirst(String.valueOf(ch), "");
				str2 = str2.replaceFirst(String.valueOf(ch), "");
			}
			if (str1.length() == str2.length()) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("Its not a Anagram String");

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_anagramString a34 = new Assignment34_anagramString();
//		boolean flag=a34.isAnagram("catc","actc");
//		if(flag) {
//			System.out.println("String is anagram");
//		}
//		else {
//			System.out.println("Its not a anagram String");
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Strings to check if they are Anagram ");
		System.out.println("Enter String 1:");
		String input1 = scanner.next();
		System.out.println("Enter String 2:");
		String input2 = scanner.next();
		a34.isAnagramStr(input1, input2);

	}

}
