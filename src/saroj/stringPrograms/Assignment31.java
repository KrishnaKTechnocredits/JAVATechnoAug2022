package saroj.stringPrograms;

import java.util.Arrays;

public class Assignment31 {
	boolean isStringPalindrome(String input) {
		boolean flag = true;
		for (int index = 0, index1 = input.length() - 1; index < index1; index++, index1--) {
			if (input.charAt(index) != input.charAt(index1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void getAllPalindrome(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String word = input[index];
			boolean flag = isStringPalindrome(word);
			if (flag) {
				System.out.println(word + " is palindrome");
			} else
				System.out.println(word + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String str = "radar";
		boolean flag = assignment31.isStringPalindrome(str);
		if (flag) {
			System.out.println(str + " is palindrome");
		} else
			System.out.println(str + " is not palindrome");
		System.out.println("=============================================");
		String[] str1 = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Given array is: " + Arrays.toString(str1));
		System.out.println("=============================================");
		assignment31.getAllPalindrome(str1);
	}
}
