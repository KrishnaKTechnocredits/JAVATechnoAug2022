package sanket;

import java.util.Scanner;

public class Assignment34AnagramStrings {

	// method to find the frequency of each character in string
	int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index))
				count++;
		}
		return count;
	}

	// method to return that given 2 string are Anagram strings or not.
	boolean isStringAnagram(String input1, String input2) {
		if (input1.length() == input2.length()) {
			for (int index = 0; index < input1.length(); index++) {
				char ch = input1.charAt(index);
				int charCountInput1 = getCharFrequency(input1, ch);
				int charCountInput2 = getCharFrequency(input2, ch);
				if (charCountInput1 != charCountInput2) {
					System.out.println("String " + input1 + " and " + input2 + " is not a Anagram String.");
					return false;
				}
			}
		} else {
			return false;
		}
		System.out.println("String " + input1 + " and " + input2 + " is a Anagram String.");
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string for checking Anagam String : ");
		String str1 = sc.nextLine();

		System.out.println("Enter the second string for checking Anagam String : ");
		String str2 = sc.nextLine();

		new Assignment34AnagramStrings().isStringAnagram(str1, str2);
		sc.close();
	}
}