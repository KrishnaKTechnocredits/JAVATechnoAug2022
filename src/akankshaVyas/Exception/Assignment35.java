/*
 *  * Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
 */
package akankshaVyas.Exception;

import java.util.Scanner;

public class Assignment35 {

	int SumOfNUmString(String str) {

		System.out.println("Given String is : " + str);
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum = sum + num;
			} catch (NumberFormatException ne) {
			}
		}
		return sum;
	}

	int getSumOfallDigitString(String str) {
		int sum = 0;
		int num = 0;
		System.out.println("Given String is : " + str);
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 0; innerIndex < arr[index].length(); innerIndex++) {
				try {
					char ch = arr[index].charAt(innerIndex);
					num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException ne) {

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment35= new Assignment35();
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("===================================================================");
		System.out.println("\" Output of Program 1 - Sum of all digit in given string is : \" " + assignment35.SumOfNUmString(str));
		System.out.println("====================================================================");
		System.out.println("Output of Program 2 - Sum of all digit in given string is : " + assignment35.getSumOfallDigitString(str));
	}
}
