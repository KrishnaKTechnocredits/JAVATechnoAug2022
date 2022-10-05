/*
Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/
package asthaSrivastava.assignment34;

import java.util.Scanner;

public class Fibonacci {

	void getFibSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		while (count < n) {
			System.out.println(num1);
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int num = sc.nextInt();
		System.out.println("Fibonacci series of " + num + " is ");
		new Fibonacci().getFibSeries(num);
	}
}
