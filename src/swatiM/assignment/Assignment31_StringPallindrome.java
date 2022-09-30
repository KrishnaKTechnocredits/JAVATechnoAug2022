/*
 * Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom

 */


package swatiM.assignment;

public class Assignment31_StringPallindrome {
	// Method to find whether given string is pallindrome
		boolean isPallindrome(String word) {
			for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
				if (word.charAt(i) != word.charAt(j)) {
					return false;
				}
			}
			return true;
		}

		void printPallindrome(String word) {
			if (isPallindrome(word)) {
				System.out.println(word + " is a pallindrom word.");
			} else {
				System.out.println(word + " is not a pallindrom word.");
			}
		}

		public static void main(String[] args) {
			Assignment31_StringPallindrome prog = new Assignment31_StringPallindrome();
			prog.printPallindrome("radar");
			prog.printPallindrome("aabcbaa");
			prog.printPallindrome("abcabc");

		}
}
