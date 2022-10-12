package sanket;

import java.util.Scanner;

public class Assignment34FactorialFibonacci {

	// method to find factorial of number
	int findFactorial(int number) {

		int fact = 1;
		for (int index = 1; index <= number; index++) {
			fact = fact * index;
		}
		System.out.println("The factorial of " + number + " is " + fact + ".");
		return fact;
	}
	
	// method to find Fibonacci Series
	void printFibonacciSeries(int number) {
		int number1 = 0;
		int number2 = 1;
		System.out.println("Fibonacci Series for " + number + " th number is : ");
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		for (int index=1; index <= number-2; index++) {
			int temp = number2;
			number2 = number1 + number2;
			number1 = temp;
			System.out.print(number2 + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("*** Factorial Program ***");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number for which you want factorial : ");
		int num = sc1.nextInt();
		new Assignment34FactorialFibonacci().findFactorial(num);
		
		System.out.println("\n");
		
		System.out.println("*** Fibonacci Series Program ***");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Nth number to print fibonacci series : ");
		int num2 = sc2.nextInt();
		new Assignment34FactorialFibonacci().printFibonacciSeries(num2);
		sc2.close();
	}
}
