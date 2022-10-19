package avni.StringNdArray;

import java.util.Arrays;
public class Palindrome {
	boolean isPallindrome(String input) {
		boolean flag = true;
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void display(String input) {
		boolean flag = isPallindrome(input);
		if (flag) {
			System.out.println(input + " is Pallindrome. ");
		} else
			System.out.println(input + " is Not a Pallindrome. ");
	}

//Program 2 :
//Write a method to print all pallindrome input from given array.

	void getPallidrome(String[] input) {
		for (String str : input) {
			boolean flag = isPallindrome(str);
			if (flag) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		Palindrome pallindrome = new Palindrome();
		String input = "radar";
		pallindrome.display(input);
		String input1 = "aabcbaa";
		pallindrome.display(input1);
		String input2 = "abcabc";
		pallindrome.display(input2);

		System.out.println("Program : 2");
		String input3[] = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Pallindrome String from given Array : " + Arrays.toString(input3));
		pallindrome.getPallidrome(input3);
	}
}

