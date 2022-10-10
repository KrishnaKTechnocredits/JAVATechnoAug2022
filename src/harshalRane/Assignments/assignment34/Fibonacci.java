package harshalRane.Assignments.assignment34;

import java.util.Scanner;

public class Fibonacci {
	void getFibonaciiSeries(int num) {
		int num1 = 0, num2 = 1, temp;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int index = 1; index <= num - 2; index++) {
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// take input from users
		System.out.println("Enter number to get it's Fibonacii Series: ");
		int num = scanner.nextInt();

		Fibonacci fibonacci = new Fibonacci();
		fibonacci.getFibonaciiSeries(num);
		scanner.close();
	}
}
