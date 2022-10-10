/*Assignment - 34 : 2nd Oct'2022

Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/

package rashmiG.Assignment34;

import java.util.Scanner;

public class FactorialNumber {

	int getFactorial(int num) {

		int fact = 1;
		for (int index = 1; index <= num; index++) {
			fact = fact * index;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial needs to calculated");
		int num = sc.nextInt();
		if (num >= 0)
			System.out.println("Factorial of number " + num + " is " + new FactorialNumber().getFactorial(num));
		else
			System.out.println("Invalid input");
		sc.close();
	}

}
