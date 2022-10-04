package shubhamG.Assignment31to40;

import java.util.Arrays;

public class Assignment31Pallindrome {

	boolean checkStringIsPallindrome(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2) {
				flag = false;
			}
		}
		return flag;
	}

	void printIfStringIsPallindromeOrNot(String str) {
		System.out.println("Input is: " + str);
		boolean flag1 = checkStringIsPallindrome(str);
		if (flag1) {
			System.out.println(str + " is pallindrome\n");
		} else {
			System.out.println(str + " is not pallindrome\n");
		}

	}

	void printPallindromeFromString(String[] arr) {
		System.out.println("Pallindrome from given array is ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = checkStringIsPallindrome(arr[i]);
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment31Pallindrome test1 = new Assignment31Pallindrome();
		test1.printIfStringIsPallindromeOrNot("radar");
		test1.printIfStringIsPallindromeOrNot("aabcbaa");
		test1.printIfStringIsPallindromeOrNot("abcabc");

		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Given input strings are " + Arrays.toString(input));
		test1.printPallindromeFromString(input);
	}
}
