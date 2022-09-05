package hindaviIngle;

public class PrimeNumberRange {
	int primeCount;
	int primeSum;
	int primeAverage;

	void primeNum(int num) {
		int count = 0;
		for (int index = 2; index <= num / 2; index++) {

			if (num % index == 0) {
				count = 1;
				// System.out.println("number is not prime number"+ num);
				break;

			}

		}
		if (count == 0) {
			//System.out.println("number is prime " + num);
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum / primeCount;
		}
	}

	void printAllPrime(int startNum, int endNum) {
		System.out.println("Prime Numbers within the given range are: ");
		for (int num = startNum; num <= endNum; num++) {
			primeNum(num);

		}
		System.out.println("\nTotal Count of prime numbers within given range is:\n" + primeCount);
		System.out.println("\nSum of prime numbers within given range is:\n" + primeSum);
		System.out.println("\nAverage of prime numbers within given range is:\n" + primeAverage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberRange primenumberrange = new PrimeNumberRange();
		primenumberrange.printAllPrime(100, 120);
	}

}
