/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/
package asthaSrivastava.assignment34;

import java.util.Scanner;

public class Factorial {

	int getFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		Factorial test = new Factorial();
		int output = test.getFactorial(num);
		System.out.println("Factorial of given number is " + output);
	}
}
