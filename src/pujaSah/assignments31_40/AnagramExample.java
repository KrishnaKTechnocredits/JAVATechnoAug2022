/* Assignment - 34 : 2nd Oct'2022
 Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram

Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13 */

package pujaSah.assignments31_40;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {

	// method to check if two given String is the Anagram of each other 
	void displayIfAnagram(String str1, String str2) {
		String origStr1 = str1, origStr2 = str2;
		if (str1.length() == str2.length()) {
			while (str1.length() > 0) {
				char ch = str1.charAt(0);
				str1 = str1.replaceFirst(String.valueOf(ch), "");
				str2 = str2.replaceFirst(String.valueOf(ch), "");
			}
			if (str1.length() == str2.length()) {
				System.out.println("Strings " + origStr1 + " and " + origStr2 + " are anagram of each other.");
			}
			else {
				System.out.println("Strings " + origStr1 + " and " + origStr2 + " are not anagram.");
			}
		}
		else 
			System.out.println("Strings " + origStr1 + " and " + origStr2 + " are not anagram.");
	}

	// method to return factorial of user defined given number
	void displayFactorial(int num) {
		int fact = 1;
		for (int index = num; index >= 1; index--) {
			fact = fact * index;
		}
		System.out.println(num + "! = " + fact);
	}

	// method to print Fibonacci series till nth number.
	void printFibonacciSeries(int n) {
		
		int[] fiboNum = new int[n];
		fiboNum[0] = 0;
		fiboNum[1] = 1;
		System.out.println("Fibonacci series upto  " + n + "th number: ");
		for (int index = 2; index < n ; index++) {
			fiboNum[index] = fiboNum[index-1] + fiboNum[index-2];
		}
		System.out.println(Arrays.toString(fiboNum));
	}

	public static void main(String[] args) {
		AnagramExample obj = new AnagramExample();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find factorial:");
		int num1 = sc.nextInt();
		obj.displayFactorial(num1);

		System.out.println("Enter a number to print Fibonacci series:");
		int num2 = sc.nextInt();
		obj.printFibonacciSeries(num2);
		
		System.out.println("Enter two strings to check for anagram: ");
		String str1 = sc.next();
		String str2 = sc.next();
		obj.displayIfAnagram(str1, str2);

		sc.close();
	}
}
