package pujaSah.assignments11_20;

public class PrimeNumbersWithReturnStatement {

	int calSumOfPrimeNumbers(int range1, int range2) {
		int num = 0;
		int sum = 0;
		for (int i = range1; i <= range2; i++) {
			num = checkPrime(i);
			sum = (sum + num);
		}
		return sum;
	}

	void displayResult(int sum, int range1, int range2) {
		System.out.println(" The sum of all prime numbers from " + range1 + " to " + range2 + " is " + sum);
	}

	int checkPrime(int number) {
		for (int x = 2; x < number / 2; x++) {
			if (number % x == 0) {
				return 0;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		PrimeNumbersWithReturnStatement obj = new PrimeNumbersWithReturnStatement();
		int totalSum = 0;
		totalSum = obj.calSumOfPrimeNumbers(5, 50);
		obj.displayResult(totalSum, 5, 50);
	}
}
