/*Assignment - 34 : 2nd Oct'2022
Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/
package adittyThakare.numberOperations;

import java.util.Scanner;

public class Assignment34_Program2 {

	// Method to return factorial of given number
	int getFactorialOfNumber(int num) {
		int factNum = 1;
		for (int index = 1; index <= num; index++) {
			factNum = factNum * index;
		}
		return factNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_Program2 assignment34_Program2 = new Assignment34_Program2();
		System.out.println("Program to return factorial of user defined number");

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter input number: ");
		int num = scanner.nextInt();
		System.out.println("Factorial of given number is: " + assignment34_Program2.getFactorialOfNumber(num));
		scanner.close();
	}

}
