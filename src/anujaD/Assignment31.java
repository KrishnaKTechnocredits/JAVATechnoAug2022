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
	*/

/*
Assignment - 31 : 29th Sep'2022
Program 2 :
Write a method to print all pallindrome input from given array.
input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package anujaD;

import java.util.Arrays;

public class Assignment31 {

	
		String findIfStringIsPallindrom(String input) {
			boolean flag = true;
			for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
				if (input.charAt(i) != input.charAt(j)) {
					flag = false;
					break;
				}
			}

			if (flag)
				return ("Given input string '" + input + "' is pallindrom string");
			else
				return ("Given input string '" + input + "' is not pallindrom string");
		}
		void findIfStringIsPallindromFromArray(String[]arr) {
			
			Assignment31 assignment31 = new Assignment31();
			for(int index=0; index<arr.length; index++) {
				System.out.println("Given input string is: " + arr[index]);
				System.out.println(assignment31.findIfStringIsPallindrom(arr[index]));
				System.out.println("------------------------------------------");
			}
		}
		
		
		public static void main(String[]args){
			
			Assignment31 assignment31 =  new Assignment31();
			System.out.println("This code is to find if string is pallindrom by using reverse string method\n");
			
	
			String input4 = "radar";
			System.out.println("Given input string is: " + input4);
			System.out.println(assignment31.findIfStringIsPallindrom(input4));
			System.out.println("--------------------------------------------------------------");

			String input5 = "aabcbaa";
			System.out.println("Given input string is: " + input5);
			System.out.println(assignment31.findIfStringIsPallindrom(input5));
			System.out.println("--------------------------------------------------------------");

			String input6 = "abcabc";
			System.out.println("Given input string is: " + input6);
			System.out.println(assignment31.findIfStringIsPallindrom(input6));
			System.out.println("--------------------------------------------------------------");
			
			String[]input= {"radar","techhpet","madam","maulikkilum"};
			System.out.println("Given input string is : "+Arrays.toString(input)+"\n");
			assignment31.findIfStringIsPallindromFromArray(input);
		}
	}
