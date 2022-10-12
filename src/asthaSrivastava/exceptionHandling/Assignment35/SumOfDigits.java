/*
Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/
package asthaSrivastava.exceptionHandling.Assignment35;

import java.util.Scanner;

public class SumOfDigits {
	// sum of digits from a String
	int getSumOfDigits(String str) {
		int sum = 0;
		int num = 0;
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length(); j++) {
				try {
					char ch = input[i].charAt(j);
					num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException ne) {
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigits test = new SumOfDigits();
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Sum of digits is " + test.getSumOfDigits(str));
	}
}