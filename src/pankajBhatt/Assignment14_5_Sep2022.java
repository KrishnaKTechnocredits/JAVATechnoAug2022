/*Assignment - 14 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28*/

package pankajBhatt;

public class Assignment14_5_Sep2022 {
	int count = 0;
	static int sum = 0;

	boolean isPrime(int num) {
		int index = 2;
		boolean flag = true;

		while (index <= num / 2) {
			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag) {
			count++;
			sum = sum + num;
		}
		return true;
	}

	void firstFivePrimeNumbers(int number) {
		int num = 2;
		while (count < number) {
			isPrime(num);
			num++;
		}
		System.out.println("Sum of First " + number + " prime numbers is: "+sum);
	}
	
	public static void main(String[] args) {
		new Assignment14_5_Sep2022().firstFivePrimeNumbers(5);
	}
}