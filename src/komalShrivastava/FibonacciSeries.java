package komalShrivastava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
	
	// method to get Fibonacci series
	
	static void getFibonacciSeries(int num) {
		int num1 = 0; 
		int num2 = 1;
		int temp;
		System.out.print(num1);
		System.out.print(" " + num2 + " ");
		for(int index=0; index<num-2; index++) {
			temp = num2;
			num2 = num1+num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
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
		getFibonacciSeries(input);
	}
}