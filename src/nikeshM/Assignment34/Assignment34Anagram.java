package nikeshM.Assignment34;

import java.util.Arrays;
import java.util.Scanner;

//Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
//
//Input1: catc
//Input2: actc
//
//Output: anagram

public class Assignment34Anagram {
	void checkAnagramString(String input1, String input2) {

		int length1 = input1.length();
		int length2 = input2.length();

		if (length1 == length2) {

			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result = Arrays.toString(arr1).equals(Arrays.toString(arr2));
			if (result) {
				System.out.println(
						"Result :  " + "\"" + input1 + "\"" + "and" + "\"" + input2 + "\"" + "........>  Are Anagram");
			} else {
				System.out.println("Result :  " + "\"" + input1 + "\"" + "and" + "\"" + input2 + "\""
						+ "........>  Are not Anagram");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two String ");
		System.out.println("Enter First String ");
		String input1 = scanner.next();
		System.out.println("Enter second String ");
		String input2 = scanner.next();
		Assignment34Anagram anagram = new Assignment34Anagram();
		anagram.checkAnagramString(input1, input2);
		scanner.close();

	}
}