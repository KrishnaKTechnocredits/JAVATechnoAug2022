/*
 * Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120	
 */
package hindaviIngle;

import java.util.Scanner;

public class Assignment34_factorialNumber {
	int getFactorialNum(int num) {
		int fact=1;
		for(int index=1;index<=num;index++) {
			fact = fact*index;		
		}
		System.out.println("factorial of a Number is  "+fact);
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_factorialNumber a34=new Assignment34_factorialNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find factorial : ");
		int input = scanner.nextInt();
		a34.getFactorialNum(input);

	}

}
