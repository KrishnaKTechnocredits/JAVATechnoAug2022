package shubhamG.Assignment31to40;

import java.util.Scanner;

/*Program 3 : Print fibonacci series till Nth number.
*/
public class Assignment34Fibonacci {

	void printFibonacciSeriesTillGivenNumber(int num) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		if (num == 1) {
			System.out.println("num1");
		} else if (num == 2) {
			System.out.println(num1);
			System.out.println(num2);
		} else if (num > 2) {
			System.out.println(num1);
			System.out.println(num2);

			for (int i = 3; i <= num; i++) {
				num3 = num1 + num2;
				System.out.println(num3);
				num1 = num2;
				num2 = num3;
			}
		} else {
			System.out.println("Invalid Number, length should be positive");
		}
	}

	public static void main(String[] args) {
		Assignment34Fibonacci fibonacci = new Assignment34Fibonacci();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Fibonacci series for length " + num + " is: ");
		fibonacci.printFibonacciSeriesTillGivenNumber(num);
		sc.close();

	}
}
