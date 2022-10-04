package apurvaBabel;

import java.util.Scanner;

public class Assignment34_FibonacciSeries {

	// Program 3 : Method to print fibonacci series till given number
	void printFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("Fibonacci series : " + num1 + " ");
		System.out.print(num2 + " ");

		for (int index = 1; index <= num - 2; index++) {
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to get Fibonacci series till that number :");
		int num = scanner.nextInt();
		
		Assignment34_FibonacciSeries assignment34 = new Assignment34_FibonacciSeries();
		assignment34.printFibonacciSeries(num);
		
		scanner.close();
	}
}
