package vibhaS.Assignment;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment38_2 {

	// Find Name Start with vowel and having Atleast one Upperacase and one digit
	boolean isFirstCharIsVowel(String str) {
		char ch = str.charAt(0);
		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			return true;
		default:

		}
		return false;
	}

	int getIsDigit(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count = 1;
			}
		}
		return count;
	}

	boolean isUpperCase(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				return true;
			}
		}
		return false;
	}

	void getProcessArrayList(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isUpperCase(arr[index]);
			boolean flag1 = isFirstCharIsVowel(arr[index]);
			int count = getIsDigit(arr[index]);
			if (flag == true && flag1 == true && count == 1) {
				list.add(arr[index]);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment38_2 assignment38_2 = new Assignment38_2();
		String[] arr1 = { "Aa3shvi", "is4h4a", "i55Sha4n", "nUpur3" };
		assignment38_2.getProcessArrayList(arr1);
	}
}
