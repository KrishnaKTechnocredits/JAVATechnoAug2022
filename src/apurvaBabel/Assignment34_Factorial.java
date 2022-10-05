package apurvaBabel;

import java.util.Scanner;

public class Assignment34_Factorial {

	// Program 2 : Method to return factorial of user defined given number
	int getFactorialValue(int num) {
		int fact = 1;
		for (int index = 1; index <= num; index++) {
			fact = fact * index;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to get its factorial value :");
		int num = scanner.nextInt();

		Assignment34_Factorial assignment34 = new Assignment34_Factorial();
		int fact = assignment34.getFactorialValue(num);
		System.out.println("Factorial of " + num + " is " + fact);

		scanner.close();
	}
}
