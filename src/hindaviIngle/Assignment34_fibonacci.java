/*
 * Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
 */
package hindaviIngle;

import java.util.Scanner;

public class Assignment34_fibonacci {
	void findFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int index = 1; index <= num - 2; index++) {// as 2 numbers are hard coded so always n-2
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.println(num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_fibonacci a34 = new Assignment34_fibonacci();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int input = scanner.nextInt();
		a34.findFibonacciSeries(input);

	}

}
