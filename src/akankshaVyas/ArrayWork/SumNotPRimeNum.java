/*
1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
*/

package akankshaVyas.ArrayWork;

public class SumNotPRimeNum {

	boolean getNotPrimeNUm(int num) {
		boolean status = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = false;
				break;
			} else
				status = true;
		}
		return status;
	}

	int sumofArray(int[] input) {
		int sum = 0;

		for (int index = 0; index < input.length; index++) {
			if (!getNotPrimeNUm(input[index])) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 11, 13, 17, 22, 44 };
		System.out.println(new SumNotPRimeNum().sumofArray(input));

	}

}
