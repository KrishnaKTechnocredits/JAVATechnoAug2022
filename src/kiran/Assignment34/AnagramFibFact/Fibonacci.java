package kiran.Assignment34.AnagramFibFact;

import java.util.Scanner;

public class Fibonacci {
	void getFibonaciiSeries(int num) {
		int num1 = 0, num2 = 1, fib;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int i=2; i<= num; i++) {
			fib = num1+num2;
			num1 = num2;
			num2 = fib;
			System.out.print(fib + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");		
		int num = sc.nextInt();
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.getFibonaciiSeries(num);
		sc.close();
	}
}