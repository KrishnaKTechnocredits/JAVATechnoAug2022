/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/
package nilamP.assignment34;

import java.util.Scanner;

public class Factorial {
	int getFactorial(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;

	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc1.nextInt();

		Factorial f = new Factorial();
		int fact = f.getFactorial(num);
		System.out.println("Factorial of " + num + " is : " + fact);
		sc1.close();
	}
}
