/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram

Program 2 : Write a method to return factorialValue of user defined given number (using scanner class).
input : 5
output : 120

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/
package ankitaBarwad;

import java.util.Scanner;

public class Anagram_Factorial_Fibonacci {

	int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	// Program 1 : How to check if two given String is the anagram of each other
	private boolean isAnagram(String str1, String str2) {
		int countStr1 = 0;
		int countStr2 = 0;
		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {
				char ch = str1.charAt(index);
				countStr1 = getCharFrequency(str1, ch);
				countStr2 = getCharFrequency(str2, ch);
				if (countStr1 != countStr2) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	void printAnagram(String str1, String str2) {
		boolean flag = isAnagram(str1,str2);
		if (flag) {
			System.out.println("Output : " + str1 + " and " + str2 + " are Anagram strings");
		} else {
			System.out.println("Output : " + str1 + " and " + str2 + " are not Anagram strings");
		}
	}

	// Program 2 : Write a method to return factorialValue of user defined given number
	int getfactorialValue(int number) {
		int factorialValue = 1;
		for (int index = 1; index <= number; index++) {
			factorialValue = factorialValue * index;
		}
		return factorialValue;
	}

	// Program 3 : Print fibonacci series till Nth number
	void printFibonacciSeries(int number) {
		System.out.print("Fibonacci Series till " + number + " terms : ");
		int num1 = 0; // num2
		int num2 = 1; // num1+num2
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		int sum = 0;
		for (int index = 1; index <= number - 2; index++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Anagram_Factorial_Fibonacci example = new Anagram_Factorial_Fibonacci();

		System.out.println("Program 1 : check if two given String are anagram of each other");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String str1 = sc.next();
		System.out.print("Enter 2nd String : ");
		String str2 = sc.next();
		example.printAnagram(str1, str2);
		
		System.out.println("\nProgram 2 : method to return factorialValue of user defined given number");
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Factorial of " + number + " : " + example.getfactorialValue(number));

		System.out.println("\nProgram 3 : method to print fibonacci series till Nth number");
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		example.printFibonacciSeries(number);
	}
}