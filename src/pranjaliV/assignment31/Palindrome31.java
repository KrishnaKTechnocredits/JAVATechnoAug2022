/*
 
Assignment - 31 : 29th Sep'2022

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

output : radar madam

 */

package pranjaliV.assignment31;
import java.util.Arrays;

public class Palindrome31 {
	
	boolean isPalindrome(String input) {
		boolean flag = true;
		for(int index1=0,index2=input.length()-1; index1<index2;index1++,index2--) {
			if (input.charAt(index1)!=input.charAt(index2)){
				flag= false;
			}
		}
		return flag;
	}
	
	void printPalindrome(String input) {
		boolean flag = isPalindrome(input);
		if(flag)
			System.out.println(input + " is a Palindrome");
		else
			System.out.println(input + " is not a Palindrome");
	}

	void printPalindromeArray(String[] input) {
		boolean flag = true;
		System.out.println("Palindrome from given String array are: ");
		System.out.println("Input : " +Arrays.toString(input));
		System.out.println("Output: ");

		  for(int index=0; index<input.length; index++) {
			  flag = isPalindrome(input[index]);
			  if(flag)
					System.out.println(input[index]);  
		  }
	}
	
	public static void main(String[] args) {
		Palindrome31 pal = new Palindrome31();
		System.out.println("Palindrome from a string: ");
		String input1 = "radar";
		pal.printPalindrome(input1);
		String input2 = "aabcbaa";
		pal.printPalindrome(input2);
		String input3 = "abcabc";
		pal.printPalindrome(input3);
		System.out.println("");


		String[] input4 = {"radar","techhpet","madam","maulikkilum"}; 
		pal.printPalindromeArray(input4);

	}

}
