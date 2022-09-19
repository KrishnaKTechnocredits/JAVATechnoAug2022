package pujaSah.assignments1_10;

public class PrimeNumber {

	void isPrime(int num) {
		if (num > 0) {
			boolean flag = true;
			for (int index = 2; index <= Math.sqrt(num); index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is a not a Prime Number.");
			} else {
				System.out.println(num + " is a Prime Number.");
			}
		} else {
			System.out.println(num + " is an invalid number.");
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(121);
		primeNumber.isPrime(37);
		primeNumber.isPrime(-10);
	}
}
