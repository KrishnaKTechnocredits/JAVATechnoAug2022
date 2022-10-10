/*Write a program to find if a given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number*/

package namratamishra.Basic_Operations;

import java.util.*;

public class PrimeNumber {

	boolean getPrimeNumber(int num) {

		boolean flag = true;
		for (int i = 2; i < num / 2; i++)
		{
			if (num % i == 0)

			{

				flag = false;

			}

		}
		return flag;
	}

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check Prime Number");
		int a = sc.nextInt();
		boolean isPrime = pm.getPrimeNumber(a);
		if (a > 0) {

			if (isPrime)

				System.out.println("The entered number: " + a + " is a prime number");
			else
				System.out.println("The entered number: " + a + " is not  a prime number");
		} else
			System.out.println(a + ": is Not a valid number");
		sc.close();
	}
}
