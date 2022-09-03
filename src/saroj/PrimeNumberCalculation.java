package saroj;

public class PrimeNumberCalculation {

	int primeCount = 0;
	int primeSum = 0;

	void checkPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number");
			primeCount++;
			primeSum = primeSum + num;
		}
	}

	void primeNumber(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			checkPrimeNumber(num);
		}
		System.out.println("Total prime number within range (" + startRange + "," + endRange + ")are: " + primeCount);
		System.out.println("Sum of all the prime number is: " + primeSum);
		System.out.println("Average of all the prime number is: " + primeSum / primeCount);
	}

	public static void main(String[] args) {
		PrimeNumberCalculation primeNumberCalculation = new PrimeNumberCalculation();
		primeNumberCalculation.primeNumber(10, 50);
	}
}
