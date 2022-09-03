package ankitaBarwad;

//Assignment No.12
public class PrimeNumberMethod {

	int primeNumberCount = 0;
	int primeNumberTotal = 0;
	int primeNumberAverage = 0;

	void isPrimeNumber(int number) {
		boolean statusFlag = true;

		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				statusFlag = false;
				// System.out.println(number + " is not a Prime Number");
				break;
			}
		}
		if (statusFlag == true) {
			System.out.println(number + " is a Prime Number");
			primeNumberCount++;
			primeNumberTotal = primeNumberTotal + number;
		}
	}

	void printAllPrimeNumber(int startRange, int endRange) {
		for (int number = startRange; number <= endRange; number++) {
			isPrimeNumber(number);
		}
		System.out.println("Total count of all Prime Numbers within range (" + startRange + "," + endRange + ") is "
				+ primeNumberCount);
		System.out.println(
				"Sum of all Prime Number within range (" + startRange + "," + endRange + ") is " + primeNumberTotal);
		System.out.println("Average of all Prime Number within range (" + startRange + "," + endRange + ") is "
				+ primeNumberTotal / primeNumberCount);
	}

	public static void main(String[] args) {
		PrimeNumberMethod primeNumberMethod = new PrimeNumberMethod();
		primeNumberMethod.printAllPrimeNumber(100, 120);
	}

}
