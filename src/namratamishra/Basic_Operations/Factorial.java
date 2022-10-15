/*
 *  Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120
*/

package namratamishra.Basic_Operations;

import java.util.Scanner;

public class Factorial {

	int getFact(int n) {
		int fact = 1;
		System.out.println("factorial of given number is:");

		while (n > 0) {

			fact = fact * n;
			n = n - 1;
		}

		return fact;
	}

	public static void main(String[] args)

	{
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check factorial");
		int num = sc.nextInt();
		System.out.println(f.getFact(num));
		sc.close();

	}
}
