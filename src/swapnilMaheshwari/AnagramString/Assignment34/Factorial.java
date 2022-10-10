/*
 Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120

 */

package swapnilMaheshwari.AnagramString.Assignment34;

import java.util.Scanner;

public class Factorial {
	int getFactorial(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {

			fact = i * fact;
			;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int fact = new Factorial().getFactorial(number);
		System.out.println("Factorial of the number is:" + fact);

	}
}
