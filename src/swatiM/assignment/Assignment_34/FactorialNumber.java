/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/

package swatiM.assignment.Assignment_34;

import java.util.Scanner;

public class FactorialNumber {

	int getFactorialOfNumber(int num) {
		int factNum = 1;
		for (int index = 1; index <= num; index++) {
			factNum = factNum * index;
		}
		return factNum;
	}

	public static void main(String[] args) {

		FactorialNumber factorialNumber = new FactorialNumber();
		System.out.println(
				"Program 2 : Write a method to return factorial of user defined given number (using scanner class).\r\n"
						+ "input : 5");

		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("\nEnter input number: ");
		int num = scanner.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("Factorial of given number is - > " + factorialNumber.getFactorialOfNumber(num));
		scanner.close();
	}

}
