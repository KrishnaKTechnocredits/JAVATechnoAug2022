package rahulSaswadkar;

public class PrimeNum {
	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
		primeNum.findPrimeNumbers(100, 120);
	}

	double count;
	double sumOfPrimeNumbersInRange;
	double avgOfPrimeNumbersInRange;

	void findPrimeNumbers(int startIndex, int endIndex) {
		System.out.println("Prime Numbers in given range(" + startIndex + "," + endIndex + ") is as below : ");
		for (int num = startIndex; num <= endIndex; num++) {
			findPrimeNumber(num);
		}
		avgOfPrimeNumbersInRange = sumOfPrimeNumbersInRange / count;
		System.out.println("\nCount of Prime Numbers in given range(" + startIndex + "," + endIndex + ") is : " + count);
		System.out.println("Sum of all Prime Numbers in given range(" + startIndex + "," + endIndex + ") is : "
				+ sumOfPrimeNumbersInRange);
		System.out.println("Average of all Prime Numbers in given range(" + startIndex + "," + endIndex + ") is : "
				+ avgOfPrimeNumbersInRange);
	}

	void findPrimeNumber(int num) {
		boolean status = true;
		if (num > 0) {
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					status = false;
					// System.out.println(num + " is not a Prime Number");
					break;
				}
			}
			// System.out.println(status);
			if (status == true) {
				System.out.println(num);
				count += 1;
				sumOfPrimeNumbersInRange = sumOfPrimeNumbersInRange + num;
			}
		} else {
			System.out.println(num + " is not a valid number");
		}
	}
}
