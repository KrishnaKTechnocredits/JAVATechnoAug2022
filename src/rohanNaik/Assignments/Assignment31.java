/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.
input : radar
output : radar is pallindrom
input : aabcbaa
output : aabcbaa is pallindrom
input : abcabc
output : abcabc is not a pallindrom
*/

package rohanNaik.Assignments;

public class Assignment31 {

	void isPalindrome(String input) {

		String originalStr = input;
		String revStr = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			revStr = revStr + originalStr.charAt(index);
		}

		if (originalStr.equals(revStr))
			System.out.println("The word " + originalStr + " is a palindrome!");
		else
			System.out.println("The word " + originalStr + " is a not palindrome!");

	}

	public static void main(String[] args) {
		Assignment31 obj = new Assignment31();
		String str = "radar";
		obj.isPalindrome(str);

	}

}

