/*
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom
*/

package namratamishra.assignment31;

import java.util.*;

public class PalendromeString {

	boolean getPalendromeString(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--)

		{
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Check Palindrome or not");
		String str1 = sc.nextLine();
		PalendromeString ps = new PalendromeString();
		boolean flag = ps.getPalendromeString(str1);
		if (flag)
			System.out.println("The given string: " + str1 + " is a palendrome string");
		else
			System.out.println("The given string: " + str1 + " is  not a  palendrome string");

		sc.close();
	}
}
