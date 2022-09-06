package ankitaBarwad;

public class PrimeNumberUsingReturn {

	int count;
	int sum;

	void printPrimeNumber(int number) {
		int index = 2;
		boolean flag = true;
		while (index <= (number / 2)) {
			if (number % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag == true) {
			System.out.print(number + " ");
			sum = sum + number;
			count++;
		}
	}

	int passNumberInLoop(int nPrimeNumber) {
		System.out.print("First " + nPrimeNumber + " Prime Numbers are : ");
		for (int number = 2; count < nPrimeNumber; number++) {
			printPrimeNumber(number);
		}
		return sum;
	}

	public static void main(String[] args) {
		int summation;
		PrimeNumberUsingReturn primeNumberUsingReturn1 = new PrimeNumberUsingReturn();
		summation = primeNumberUsingReturn1.passNumberInLoop(5);
		System.out.println("\nSum = " + summation + "\n");

		PrimeNumberUsingReturn primeNumberUsingReturn2 = new PrimeNumberUsingReturn();
		summation = primeNumberUsingReturn2.passNumberInLoop(10);
		System.out.println("\nSum = " + summation + "\n");

		PrimeNumberUsingReturn primeNumberUsingReturn3 = new PrimeNumberUsingReturn();
		summation = primeNumberUsingReturn3.passNumberInLoop(16);
		System.out.println("\nSum = " + summation + "\n");
	}
}