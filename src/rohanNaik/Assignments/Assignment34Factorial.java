/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120
*/
package rohanNaik.Assignments;

import java.util.Scanner;

public class Assignment34Factorial {

	int getFactorial(int num) {
		int factorial = 1;

		for (int index = 1; index <= num; index++) {
			factorial = factorial * index;
		}

		return factorial;
	}

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		Assignment34Factorial obj = new Assignment34Factorial();
		int ans = obj.getFactorial(num);
		System.out.println(ans);
	}

}
