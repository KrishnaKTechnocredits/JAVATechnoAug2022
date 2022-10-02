/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/
package maheshSantoki.SpecialInterview;

import java.util.Scanner;

public class Factorial {
	int factorial(int num) {
		int fact = 1;// Minimum Factorial is always 1;
		int i = num;
		while (i > 0) { // counting the factorial using while loop
			fact = fact * i;
			i--;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in); // creating object of Scanner class
		int num = sc.nextInt();

		Factorial facto = new Factorial();
		System.out.println("Factorial of " + num + " is " + facto.factorial(num));
	}
}