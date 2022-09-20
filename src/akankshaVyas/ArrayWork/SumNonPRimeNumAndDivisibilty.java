/*
Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)
*/

/*
1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
*/

package akankshaVyas.ArrayWork;

public class SumNonPRimeNumAndDivisibilty {

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

	boolean getDivisibleNumBy5n7(int num) {
		boolean status = true;
		if (num % 5 == 0 && num % 7 == 0) {
			status = true;
		} else
			status = false;
		return status;
	}

	int sumofArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (!getNotPrimeNUm(input[index]) && getDivisibleNumBy5n7(input[index])) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 11, 35, 17, 105, 44 };
		System.out.println(new SumNonPRimeNumAndDivisibilty().sumofArray(input));

	}

}
