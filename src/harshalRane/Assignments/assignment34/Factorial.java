package harshalRane.Assignments.assignment34;

import java.util.Scanner;

public class Factorial {
	//method to return factorial of given number
	int getFactorial(int num) {
		int fact = 1;
		for(int index=1;index<=num;index++) {
			fact = fact * index;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// take input from users
		System.out.println("Enter number to get factorial of given number:");
		int num = scanner.nextInt();
		
		Factorial factorial = new Factorial();
		int fact = factorial.getFactorial(num);
		System.out.println("Factorial is: "+fact);
		scanner.close();
	}
}
