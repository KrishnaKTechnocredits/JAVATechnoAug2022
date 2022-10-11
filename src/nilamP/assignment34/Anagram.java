/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/
package nilamP.assignment34;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	void getAnagram(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		if (length1 == length2) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			boolean result = Arrays.toString(arr1).equals(Arrays.toString(arr2));
			if (result) {
				System.out.println(str1 + " and " + str2 + " is anagram");
			} else {
				System.out.println(str1 + " and " + str2 + " is not anagram");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter sting 1: ");
		String input1 = sc.next();
		System.out.println("enter sting 2: ");
		String input2 = sc.next();

		Anagram a = new Anagram();
		a.getAnagram(input1, input2);
		sc.close();

	}

}
