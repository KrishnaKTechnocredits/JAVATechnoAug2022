
/*
 * Assignment - 15 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28

 */
package hindaviIngle;

public class Assignment15 {
	int status = 0;

	boolean getPrimeNumber(int num) {
		int status = 0;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = 1;
				break;
			}
		}
		if (status == 0) {
			return true;
		}
		return false;
	}

	int sumOfPrimeNum(int range1, int range2) {
		int sum = 0;
		int counter = 0;

		for (int i = range1; i <= range2; i++) {

			if (getPrimeNumber(i)) {
				System.out.println(i);
				sum = (sum + i);
				counter++;
			}

			if (counter == 5)
				break;
		}
		return sum;
	}

	void display(int sum, int range1, int range2) {
		System.out.println("The sum of first five prime numbers between " + range1 + " and " + range2 + " is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment15 sumOfFirst5PrimeReturn = new Assignment15();

		int totalsum = sumOfFirst5PrimeReturn.sumOfPrimeNum(50, 500);

		sumOfFirst5PrimeReturn.display(totalsum, 50, 500);

	}

}
