package chiragPatel;

import chiragPatel.Assignment12;

public class Assignment12 {
	int primeCount = 0;
	int primeSum = 0;
	int primeAverage = 0;

	void checkPrimeNumber(int num) {
		boolean primeFlag = true;
		for (int index = 3; index <= num / 3; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(num + " is a prime number.");
			primeCount++;
			primeSum = primeSum + num;
		}
	}

	void printAllPrime(int startNum, int endNum) {
		for (int num = startNum; num <= endNum; num++) {
			checkPrimeNumber(num);
		}
		primeAverage = primeSum / primeCount;
		System.out.println("Total prime numbers within range " + startNum + "," + endNum + " are: " + primeCount);
		System.out.println("Sum of all the prime numbers within range " + startNum + "," + endNum + " is: " + primeSum);
		System.out.println(
				"Average of all the prime numbers within range " + startNum + "," + endNum + " is: " + primeAverage);
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.printAllPrime(100, 120);
	}
}
