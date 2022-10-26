
/*****Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*****/

package mohiniA.ArrayOprationAssignments.ScannerInputAssignment34;

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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get it's Fibonacii Series: ");
		int num = scanner.nextInt();

		Fibonacci fibonacci = new Fibonacci();
		fibonacci.getFibonaciiSeries(num);
		scanner.close();
	}
}
