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
package shrutiArora;
import java.util.Arrays;
public class Assignment31 {
	 private static boolean checkPalindrome(String str) {
		 boolean flag = true;
		for(int i = 0 , j = str.length()-1;i<j;i++,j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if(ch1 != ch2) {
				flag = false ;
				break;
			}
		}
		return flag;
	}
		
	void printStringIsPalindromeOrNOt(String input) {
		System.out.println("input: " + input);
		System.out.println("Output: ");
	    boolean flag = checkPalindrome(input);
		if(flag)
			System.out.println(input + " is Palindrome");
		else 
			System.out.println(input + " is not Palindrome");
	}
	void printAllPalindrome(String[] arr) {
		System.out.println(" Output: ");
		for( int index = 0 ; index<arr.length;index++) {
			boolean flag = checkPalindrome(arr[index]);
			if(flag)
				System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		System.out.println("*************************************************Program1****************************************");
		assignment31.printStringIsPalindromeOrNOt("radar");
		assignment31.printStringIsPalindromeOrNOt("aabcbaa");
		assignment31.printStringIsPalindromeOrNOt("abcabc");
		System.out.println("*************************************************Program2****************************************");
		String[] input = {"radar" ,"techhpet" , "madam" ,"maulikkilum"};
		System.out.println("input: " + Arrays.toString(input));
		assignment31.printAllPalindrome(input);
	}
}