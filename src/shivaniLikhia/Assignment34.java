/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram

Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*/

package shivaniLikhia;

import java.util.Arrays;

import java.util.Scanner;

public class Assignment34 {

	void checkAnagramString(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean isAnagramFlag = Arrays.toString(arr1).equals(Arrays.toString(arr2));
			if(isAnagramFlag) {
				System.out.println("The given Strings " +str1+" and "+str2+" are Anagram Strings.");
			}
		}
		else {
			System.out.println("The given strings " +str1+ " and "+str2+" are not Anagram Strings.");
		}	
	}
	
	int getFactorialOfNumber(int num) {
		int fact = 1;
		System.out.println("The factorial of the Given number is : ");
		for(int index=1;index<=num;index++) {
			fact = fact * index;
		}
		return fact;
	}
	
	void printFibonacciSeries(int num) {
		System.out.println("The Fibonacci series for given Number is : ");
		int num1 = 0,  num2 = 1;;
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		
		if(num>0) {
			for(int index=1;index<=num-2;index++) {
				int temp = num2;
				num2 = num1 + num2;
				num1 = temp;
				System.out.print(num2+ " ");
			}
		}
		else {
			System.out.println("Invalid Input!");
		}
		
	}
	
	public static void main(String[] args) {
		
		Assignment34 assignment34 = new Assignment34();
		
		System.out.println("--------------------------------Program 1----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Strings to check the String is Anagram :");
		System.out.println("Enter First String :");
		String str1 = sc.next();
		System.out.println("Enter Second String : ");
		String str2 = sc.next();
		assignment34.checkAnagramString(str1, str2);
		
		
		System.out.println("--------------------------------Program 2----------------------------------");
		System.out.println("Enter the Number to find Factorial :");
		int num = sc.nextInt();
		System.out.println(assignment34.getFactorialOfNumber(num));

		
		System.out.println("--------------------------------Program 3----------------------------------");
		System.out.println("Enter the Number to find Fibonacci series : ");
		int num1 = sc.nextInt();
		assignment34.printFibonacciSeries(num1);
		sc.close();
	}
	
	
}
