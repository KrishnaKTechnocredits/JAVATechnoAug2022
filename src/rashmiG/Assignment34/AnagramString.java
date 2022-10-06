/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram*/

package rashmiG.Assignment34;

import java.util.Scanner;

public class AnagramString {

	private int getCharFreq(String str, char ch) {
		int charCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index))
				charCount++;
		}
		return charCount;
	}

	private boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {
				char ch = str1.charAt(0);
				int countCh1 = getCharFreq(str1, ch);
				int countCh2 = getCharFreq(str2, ch);
				if (countCh1 != countCh2)
					return false;
			}
			return true;
		} else
			return false;
	}

	public void display(String str1, String str2) {
		boolean isAnagramFlag = isAnagram(str1, str2);
		if (isAnagramFlag)
			System.out.println("Anagram string");
		else
			System.out.println("Not an anagram string");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st String");
		String str1 = sc.next();
		System.out.println("Please enter 2nd String");
		String str2 = sc.next();
		new AnagramString().display(str1, str2);
		sc.close();
	}
}
