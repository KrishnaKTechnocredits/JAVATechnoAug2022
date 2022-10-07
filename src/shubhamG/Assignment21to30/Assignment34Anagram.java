package shubhamG.Assignment21to30;

import java.util.Scanner;

public class Assignment34Anagram {

	int getFrequencyOfCharacter(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				count++;
		}
		return count;
	}

	boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		boolean flag = true;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				char ch = str1.charAt(0);
				int count1 = getFrequencyOfCharacter(str1, ch);
				int count2 = getFrequencyOfCharacter(str2, ch);
				if (count1 != count2)
					flag = false;
			}
		} else
			flag=false;
		return flag;
	}

	void display(String str1, String str2) {
		boolean isAnagramFlag = isAnagram(str1, str2);
		if (isAnagramFlag)
			System.out.println("String is Anagram ");
		else
			System.out.println("String is not an anagram");
	}

	public static void main(String[] args) {
		Assignment34Anagram anagram = new Assignment34Anagram();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 1st String");
		String str1 = sc.next();

		System.out.println("Please enter 2nd String");
		String str2 = sc.next();

		anagram.display(str1, str2);
		sc.close();
	}

}
