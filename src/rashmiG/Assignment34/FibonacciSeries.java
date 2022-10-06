/*Assignment - 34 : 2nd Oct'2022

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/

package rashmiG.Assignment34;

import java.util.Scanner;

public class FibonacciSeries {

	void displayFibonacciSeries(int size) {
		if (size > 0) {
			int num1 = 0;
			int num2 = 1;
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			for (int index = 1; index <= size - 2; index++) {
				int temp = num2;
				num2 = num1 + num2;
				num1 = temp;

				System.out.print(num2 + " ");
			}
		} else
			System.out.println("Invalid input");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of fibonacci series");
		int size = sc.nextInt();
		new FibonacciSeries().displayFibonacciSeries(size);
		sc.close();
	}

}
