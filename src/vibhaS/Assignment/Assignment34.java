package vibhaS.Assignment;

import java.util.Scanner;

public class Assignment34 {

	// Write a program to find Anagram String
	int getCountOfchar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	boolean isAnagramString(String str, String str1) {
		if (str.length() == str1.length()) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (index == str.indexOf(ch)) {
					int count1 = getCountOfchar(str, ch);
					int count2 = getCountOfchar(str1, ch);
					if (count1 != count2) {
						return false;
					}
				}
			}
		} else {
			return false;
		}
		return true;
	}

	// Write a program to find factorial
	void printFactorial(int num) {
		int fact = 1;
		for (int index = 1; index <= num; index++) {
			fact = fact * index;
		}
		System.out.println("Factorial of " + num + " is => " + fact);
	}

	// Print fibonacci series till nth number
	void printFibonacci(int num) {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 1; index < num - 2; index++) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(num2 + " ");
		}

	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scanner.next();
		System.out.println("Enter word");
		String word1 = scanner.next();
		boolean ans = assignment34.isAnagramString(word, word1);
		if (ans == true) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}
		System.out.println("");
		System.out.println("Enter number");
		int num = scanner.nextInt();
		assignment34.printFactorial(num);
		System.out.println("");
		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		assignment34.printFibonacci(num1);
	}
}
