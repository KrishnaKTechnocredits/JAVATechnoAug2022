/*Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*/
package maheshSantoki.SpecialInterview;

import java.util.Scanner;

public class Fibonacci {
	void fibonacciseries(int num) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 1; i <= num - 2; i++) {
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in); // creating object of Scanner class
		int num = sc.nextInt();

		Fibonacci fibonacci = new Fibonacci();
		System.out.println("Fibonacci Series : ");
		fibonacci.fibonacciseries(8);
	}
}
