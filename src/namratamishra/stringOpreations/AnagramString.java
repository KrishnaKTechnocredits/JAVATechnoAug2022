/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/

package namratamishra.stringOpreations;

import java.util.*;

public class AnagramString {
	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}

	boolean isAnagramString(String str1, String str2) {

		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {
				char ch = str1.charAt(index);
				int CountCh1 = getCharFreq(str1, ch);
				int CountCh2 = getCharFreq(str2, ch);
				if (CountCh1 != CountCh2)
					return false;
			}
		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args)

	{
		AnagramString an = new AnagramString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings to check anagram");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (an.isAnagramString(str1, str2))
			System.out.println("Entered String is anagram string");
		else
			System.out.println("Entered String is not an anagram string");
		sc.close();

	}
}
