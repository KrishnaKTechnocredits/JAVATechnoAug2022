/*1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66) */
package asthaSrivastava.arrayBasics;

class SumOfNonPrime { //Program 1

	boolean getPrimeNumber(int num) {

		boolean flag = true;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	int getSumOfNonPrime(int[] input) {
		int sum = 0;

		for (int index = 0; index < input.length; index++) {
			boolean flag = getPrimeNumber(input[index]);
			if (flag == false)
				sum = sum + input[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNonPrime pM = new SumOfNonPrime();
		int[] num = { 11, 13, 17, 22, 44 };
		System.out.println("Sum of Non Prime Number is :" + pM.getSumOfNonPrime(num));

	}
}