/*Assignment - 34 : 2nd Oct'2022
Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/
package adittyThakare.numberOperations;

import java.util.Scanner;

public class Assignment34_Program3 {

	// Method to print fibonacci series till given number
	void printFibonacci(int rangeNum) {
		int num1 = 0, num2 = 1, result = 0;
		for (int index = 1; index <= rangeNum - 2; index++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.print(" " + result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_Program3 assignment34_Program3 = new Assignment34_Program3();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Program to print Fibonacci series!");
		System.out.println("\nEnter input number: ");
		int num = scanner.nextInt();
		System.out.println("\nFibonacci series till given input number: ");
		System.out.print(0 + " " + 1);
		assignment34_Program3.printFibonacci(num);
		scanner.close();
	}

}
