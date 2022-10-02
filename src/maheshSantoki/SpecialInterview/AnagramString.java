// Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
//
//Input1: catc
//Input2: actc
//
//Output: anagram
package maheshSantoki.SpecialInterview;

import java.util.Scanner;

public class AnagramString {
	int getFreqOfch(int ch, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	String isAnagram(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return "Not Anagram";
		} else {
			for (int i = 0; i < len1; i++) {
				char ch = str1.charAt(i);
				int countch1 = getFreqOfch(ch, str1);
				int countch2 = getFreqOfch(ch, str2);
				if (countch1 != countch2)
					return "Not Anagram";
			}
		}
		return "Anagram";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating object of Scanner class
		System.out.println("Enter String 1 : ");
		String name1 = sc.next();
		System.out.println("Enter String 2 : ");
		String name2 = sc.next();
		AnagramString anagram = new AnagramString();
		System.out.println(anagram.isAnagram(name1, name2));

	}
}
