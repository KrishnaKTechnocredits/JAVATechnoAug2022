/*Assignment - 14 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28*/

package deepakPatil;

public class FirstNPrimeSumReturn {
	int count = 0;
	int sum = 0;

	boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println(number);
			count++;
			sum = sum + number;
		}
		return true;
	}

	int getSumOfNPrimeNumbers(int num) {
		System.out.println("First "+num+" prime numbers are:");
		int number = 2;
		while (count < num) {
			isPrime(number);
			number++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=5;
		int totalSum = new FirstNPrimeSumReturn().getSumOfNPrimeNumbers(n);
		System.out.println("\nSum of first "+n+" prime number is "+ totalSum);
	}
}
