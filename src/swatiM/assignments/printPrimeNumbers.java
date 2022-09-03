package swatiM.assignments;

public class printPrimeNumbers {

	int primeCount;
	int primeSum;
	int primeAverage;

	void printPrimeNumbers(int num) {
		boolean primeFlag = true;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(num);
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum / primeCount;
		}
	}

	void primeRange(int startIndex, int endIndex) {
		System.out.println("Prime Numbers within the given range are: ");
		for (int num = startIndex; num <= endIndex; num++) {
			printPrimeNumbers(num);
		}
		System.out.println("\nTotal Count of prime numbers within given range is:\n" + primeCount);
		System.out.println("\nSum of prime numbers within given range is:\n" + primeSum);
		System.out.println("\nAverage of prime numbers within given range is:\n" + primeAverage);
	}

	public static void main(String[] args) {
		new printPrimeNumbers().primeRange(100, 130);
	}

}
