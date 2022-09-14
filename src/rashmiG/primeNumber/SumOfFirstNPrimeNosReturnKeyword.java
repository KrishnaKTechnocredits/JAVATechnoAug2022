/*Assignment - 14 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28*/

package rashmiG.primeNumber;

class SumOfFirstNPrimeNosReturnKeyword {
	int count = 0;

	boolean isPrime(int num) {

		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				return false;
			}
			index++;
		}
		count++;
		return true;

	}

	void findSumOfNPrimeNos(int targetNum) {
		int num = 2;
		int sum = 0;
		while (count != targetNum) {
			boolean isPrimeFlag = isPrime(num);

			if (isPrimeFlag) {
				// System.out.println(num);
				sum = sum + num;
			}
			num++;
		}
		System.out.println("Sum of first " + targetNum + " prime numbers is " + sum);
	}

	public static void main(String[] args) {
		new SumOfFirstNPrimeNosReturnKeyword().findSumOfNPrimeNos(5);
		
		
	}
}
