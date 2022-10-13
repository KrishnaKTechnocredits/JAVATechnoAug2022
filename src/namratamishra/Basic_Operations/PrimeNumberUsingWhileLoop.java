/*
Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11
*/
package namratamishra.Basic_Operations;

import java.util.*;

public class PrimeNumberUsingWhileLoop {

	void printNPrimeNumbers(int N) {
		int count = 0;
		int num = 2;
		System.out.println("the first " + N + " Prime Numbers are:");
		while (count != N) {
			boolean flag = true;
			int index = 2;
			while (index <= num / 2) {
				if (num % index == 0) {
					flag = false;
					break;
				}
				index++;
			}

			if (flag == true) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		PrimeNumberUsingWhileLoop pm = new PrimeNumberUsingWhileLoop();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to  print N Prime Number");
		int a = sc.nextInt();
		pm.printNPrimeNumbers(a);
		sc.close();
	}
}
