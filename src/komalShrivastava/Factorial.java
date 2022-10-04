package komalShrivastava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	//method to return factorial of user defined given number (using scanner class).
	
	int getFactorial(int num) {
		int fact = 1;
		for(int index = 2; index<=num; index++) {
			fact = fact*index;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int input = 0;
		while(count<1) {
			try {
				System.out.println("Enter number to get Factorial : ");
				input = scanner.nextInt();
				count++;
			}catch(InputMismatchException ie) {
				System.out.println("Not a valid input, please try again\n");
				scanner.nextLine();
			}
	    }
		scanner.close();
		Factorial factorial = new Factorial();
		int fact = factorial.getFactorial(input);
		System.out.println("Factorial of " + input + " is : " + fact);
	}
}