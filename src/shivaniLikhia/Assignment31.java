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
         madam
*/

package shivaniLikhia;
import java.util.Arrays;

public class Assignment31 {

	boolean isStringPallindrome(String str) {
		boolean isPallindrome = true;
		for(int index=0,j=str.length()-1;index<j;index++,j--) {
			if(str.charAt(index)!=str.charAt(j)) {
				isPallindrome = false;
			}
			
		}
		return isPallindrome;
	} 
	
	void printPallindromeString(String str) {
		boolean flag = isStringPallindrome(str);
		System.out.println("Input is : "+str);
		if(flag) {
			System.out.println("The given String "+ str +" is a Pallindrome String.");
		}
		else {
			System.out.println("The given String "+ str +" is not a Pallindrome String.");
		}
	}
	
	void printPallimdromeStringFromArray(String[] arr) {
		System.out.println("Input Array is : "+Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			boolean flag = isStringPallindrome(arr[index]);
			if(flag) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.printPallindromeString("radar");
		System.out.println("--------------------------------------------------------------");
		assignment31.printPallindromeString("aabcbaa");
		System.out.println("--------------------------------------------------------------");
		assignment31.printPallindromeString("abcabc");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		String[] arr = {"radar","techhpet","madam","maulikkilum"};
		assignment31.printPallimdromeStringFromArray(arr);
		
		
		
	}
}
