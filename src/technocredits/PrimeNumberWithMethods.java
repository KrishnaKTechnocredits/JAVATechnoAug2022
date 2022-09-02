package technocredits;

public class PrimeNumberWithMethods {
	int primeCount = 0;
	int primeSum = 0;

	void checkPrimeNum(int num) {
		boolean primeFlag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(num + " is a prime number");
			primeCount++;
			primeSum = primeSum + num;
		}
	}

	void printAllPrime(int startNum, int endNum) {
		if (startNum < endNum) {
			for (int num = startNum; num <= endNum; num++) {
				checkPrimeNum(num);
			}
			System.out.println("Total prime numbers within range (" + startNum + "," + endNum + ") are " + primeCount);
			System.out.println("Sum of all the prime numbers is " + primeSum);
		}else {
			System.out.println("Invalid range");
		}
	}

	public static void main(String[] args) {
		new PrimeNumberWithMethods().printAllPrime(100, 150);
	}
}
