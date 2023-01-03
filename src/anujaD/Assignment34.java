package anujaD;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34 {

	int getfrequencychar(String str1, char ch) {
		int count = 0;
		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == (ch)) {
				count++;
			}
		}
		return count;
	}

	boolean isAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			for (int index = 0; index < str1.length(); index++) {

				char ch1 = str1.charAt(index);
				int str1count = getfrequencychar(str1, ch1);
				int str2count = getfrequencychar(str2, ch1);
				if (str1count != str2count) {

					return false;
				}
			}
			return true;
		} else
			return false;

	}

// Program 2 : Write a method to return factorial of user defined given number(using scanner class).
	void Factorial(int num) {

		int fact = 1;

		for (int index = 1; index <= num; index++) {
			fact = fact * index;
		}
		System.out.println("Factorial of " + num + "! =" + fact);
	}

	void printAnagram(String str1, String str2) {
		boolean isAnagram = isAnagram(str1, str2);
		if (isAnagram == true) {
			System.out.println("Strings '" + str1 + "' & '" + str2 + "' are Anagram");
		} else {
			System.out.println("Strings '" + str1 + "' & '" + str2 + "' are not Anagram");
		}

	}

//Program 3 : Print fibonacci series till Nth number.
	void fibona(int num) {

		int[] fibo = new int[num];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println("Print fibonacci series till " + num + " number: ");
		for (int index = 2; index <= num - 1; index++) {
			fibo[index] = fibo[index - 2] + fibo[index - 1];
		}
		System.out.println(Arrays.toString(fibo));
	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1 to check Anagram");
		String str1 = sc.next();
		System.out.println("Enter String 2 to check Anagram");
		String str2 = sc.next();
		assignment34.printAnagram(str1, str2);

		System.out.println("Enter the number for factorial:");
		int num = sc.nextInt();
		assignment34.Factorial(num);

		System.out.println("Enter the Nth number till fibonacci is required:");
		int num2 = sc.nextInt();
		assignment34.fibona(num2);

		sc.close();

	}
}
