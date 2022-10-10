/*
Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/
package smitaVetal.Assignment31_40;

import java.util.Scanner;

public class Assignment34_1 {

	int getfrequencychar(String str1, char ch) {
		int count = 0;
		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == (ch)) {
				count++;
			}
		}
		return count;
	}

	boolean isAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {

				char ch1 = str1.charAt(index);
				int str1count = getfrequencychar(str1, ch1);
				int str2count = getfrequencychar(str2, ch1);
				if (str1count != str2count) {

					return false;
				}
			}
			return true;
		} else
			return false;
	}

	void printAnagram(String str1, String str2) {
		boolean isAnagram = isAnagram(str1, str2);
		if (isAnagram == true) {
			System.out.println("Strings '" + str1 + "' & '" + str2 + "' are Anagram");
		} else {
			System.out.println("Strings '" + str1 + "' & '" + str2 + "' are not Anagram");
		}
	}

	public static void main(String[] args) {

		Assignment34_1 assignment34 = new Assignment34_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 to check Anagram");
		String str1 = sc.next();
		System.out.println("Enter String 2 to check Anagram");
		String str2 = sc.next();
		assignment34.printAnagram(str1, str2);
		sc.close();
	}
}
