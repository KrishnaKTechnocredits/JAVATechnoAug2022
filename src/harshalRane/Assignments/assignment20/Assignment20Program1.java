/*1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
*/
package harshalRane.Assignments.assignment20;

import java.util.Arrays;

public class Assignment20Program1 {
	static boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return flag;
	}

	int isNotPrimeFromArray(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isPrime(num[index]);
			if (flag == false) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment20Program1 a = new Assignment20Program1();
		int[] input = { 11, 13, 17, 22, 44 };
		System.out.println("Sum of all non prime numbers from given array " + Arrays.toString(input) + " is: -- " +a.isNotPrimeFromArray(input));
	}
}
