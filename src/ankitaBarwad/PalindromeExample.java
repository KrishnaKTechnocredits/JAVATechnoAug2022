/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/
package ankitaBarwad;

import java.util.Arrays;

public class PalindromeExample {

	boolean isPalindrome(String inputString){
		
		boolean flag = true;
		for(int startIndex=0,endIndex=inputString.length()-1; startIndex < endIndex; startIndex++,endIndex--) {
			if(inputString.charAt(startIndex) != inputString.charAt(endIndex)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void printPalindrome(String inputString) {
		boolean flag = isPalindrome(inputString);
		if(flag) {
			System.out.println(inputString + " is palindrome");
		}
		else {
			System.out.println(inputString + " is not palindrome");
		}
	}
	
	void printAllPalindrome(String[] inputArray) {
		System.out.println("Input String : " + Arrays.toString(inputArray));
		for(int index = 0;index<inputArray.length;index++) {
			boolean flag = isPalindrome(inputArray[index]);
			if(flag) {
				System.out.println(inputArray[index] + " is palindrome");
			}
		}
	}
	public static void main(String[] args) {
		PalindromeExample palindromeExample = new PalindromeExample();
		System.out.println("Program 1 :");
		palindromeExample.printPalindrome("radar");
		palindromeExample.printPalindrome("aabcbaa");
		palindromeExample.printPalindrome("abcabc");
		System.out.println("\nProgram 2 :");
		String[] inputArray = {"radar","techhpet","madam","maulikkilum"};
		palindromeExample.printAllPalindrome(inputArray);
	}
}
