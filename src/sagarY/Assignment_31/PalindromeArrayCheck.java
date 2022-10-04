/*Program 2 :Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package sagarY.Assignment_31;
import java.util.Arrays;

public class PalindromeArrayCheck {

	static {
		System.out.println("Program 2 :Write a method to print all \n pallindrome input from given array.");
		System.out.println("------------------------------------------");
	}

	boolean isPalidrome(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return flag;
	}

	void printPalindrom(String[] str) {
		System.out.println("Output: Palindrome Strings are:");
		for (int i = 0; i < str.length; i++) {
			boolean flag = isPalidrome(str[i]);
			if (flag) {
				System.out.println(":" + str[i]);
			}
		}
	}

	public static void main(String[] args) {
		PalindromeArrayCheck check = new PalindromeArrayCheck();
		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		System.out.println("Input: " + Arrays.deepToString(input));
		check.printPalindrom(input);
	}
}