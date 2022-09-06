/*
	 * 1. We need to do sum of first 5 prime number, using return keyword output: (2
	 * + 3 + 5 + 7 + 11) = 28
	 */

package akankshaVyas.Return_type;

public class PrimeWithReturnType {

	int count = 0;

	boolean isPrime(int num) {
		boolean status = true;
		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				status = false;
				return false;
			}
			index++;
		}
		if (status == true) {
			count++;
			return true;
		} else
			return false;
	}

	void sumOfFirstFiveNum(int counting) {

		int num = 2;
		int sum = 0;
		{
			while (count != counting) {

				boolean status = isPrime(num);
				if (status) {
					System.out.println(num + " is a prime number ");
					sum = sum + num;
				}
				num++;
			}
			System.out.println("\n"+sum + " is sum of first five prime num ");
		}
	}

	public static void main(String[] args) {
		PrimeWithReturnType primeWithReturnType = new PrimeWithReturnType();
		primeWithReturnType.sumOfFirstFiveNum(5);

	}

}
