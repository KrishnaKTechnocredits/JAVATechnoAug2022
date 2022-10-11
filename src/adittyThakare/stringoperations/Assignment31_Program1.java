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
package adittyThakare.stringoperations;

public class Assignment31_Program1 {
	boolean isPalindrome(String str) {
		boolean palindromeflag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) { // Iterate For loop such that 1st character and last character of String is checked and so on until both character index position is not same
			if (str.charAt(i) != str.charAt(j)) { //If character at i and j position are not same, String not a palindrome
				palindromeflag = false;
				break;
			}
		}
		return palindromeflag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31_Program1 assignment31_Program1 = new Assignment31_Program1();
		String str = "radar", str1 = "aabcbaa", str2 = "abcabc";
		System.out.println("Program to find whether given string is Palindrome!");
		System.out.println("\nInput String: " + str);
		System.out.println("Is Palindrome? " + assignment31_Program1.isPalindrome(str));
		System.out.println("\nInput String: " + str1);
		System.out.println("Is Palindrome? " + assignment31_Program1.isPalindrome(str1));
		System.out.println("\nInput String: " + str2);
		System.out.println("Is Palindrome? " + assignment31_Program1.isPalindrome(str2));

	}

}
