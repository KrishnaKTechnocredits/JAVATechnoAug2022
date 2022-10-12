/*Assignment - 34 : 2nd Oct'2022
Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/

package swatiM.assignment.Assignment_34;

import java.util.Scanner;

public class FibonacciSeries {

	void printFibonacci(int rangeNum) {
		int num1 = 0, num2 = 1, result = 0;
		for (int index = 1; index <= rangeNum - 2; index++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.print(" " + result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibonacciSeries = new FibonacciSeries();

		Scanner scanner = new Scanner(System.in);

		System.out.println( "Program 3 : Print fibonacci series till Nth number.\r\n"
				+ "input : 8");
		System.out.println("---------------------------------------");
		System.out.println("\nEnter input number: ");
		int num = scanner.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("\nFibonacci series till given input number: ");
		System.out.print(0 + " " + 1);
		fibonacciSeries.printFibonacci(num);
		scanner.close();
	}

}
