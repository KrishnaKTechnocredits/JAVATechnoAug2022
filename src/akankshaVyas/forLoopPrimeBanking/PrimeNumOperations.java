package akankshaVyas.forLoopPrimeBanking;

public class PrimeNumOperations {

	int count;
	int num;
	int sum;
	int avg;

	void checkPrimeNum(int num) {
		boolean status = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(num);
			count++;
			sum = sum + num;
			avg = sum / count;
		}

	}

	void primeRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			checkPrimeNum(index);
		}
		System.out.println("Total count of prime num within given range is " + count);
		System.out.println("The sum of prime num are " + sum);
		System.out.println("Avg is " + avg);
	}

	public static void main(String[] args) {
		PrimeNumOperations primeNumOperations = new PrimeNumOperations();
		primeNumOperations.primeRange(100, 120);
	}

}
