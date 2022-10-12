/*
Assignment - 31 : 29th Sep'2022
Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package deepakPatil.Assignment31PalindromeString;

import java.util.Arrays;

public class Assignment31_3 {
	
	void findIfStringIsPallindromFromArray(String[]arr) {
		
		Assignment31_2 assignment31_2 = new Assignment31_2();
		for(int index=0; index<arr.length; index++) {
			System.out.println("Given input string is: " + arr[index]);
			System.out.println(assignment31_2.findIfStringIsPallindrom(arr[index]));
			System.out.println("------------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		Assignment31_3 assignment31_3 = new Assignment31_3();
		
		String[]input= {"radar","techhpet","madam","maulikkilum"};
		System.out.println("Given input string is : "+Arrays.toString(input)+"\n");
		assignment31_3.findIfStringIsPallindromFromArray(input);
	}
}
