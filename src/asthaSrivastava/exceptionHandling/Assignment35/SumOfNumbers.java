/*
Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

*/
package asthaSrivastava.exceptionHandling.Assignment35;

import java.util.Scanner;

public class SumOfNumbers {
	// sum of numbers from a String
	int getSumOfNumbersFromString(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum = sum + num;
			} catch (NumberFormatException e) {
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers num = new SumOfNumbers();
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Sum of Numbers is : " + num.getSumOfNumbersFromString(str));
	}
}