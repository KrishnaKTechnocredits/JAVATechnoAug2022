package swapnilMaheshwari.PrimeNumberAllPrograms;

public class NprimeNumberOptimized {
	int count = 1;

	void primeNoRange(int num) {
		boolean status = true;

		for (int j = 2; j <= num / 2; j++) {
			if (num % j == 0) {
				// System.out.println(i+ " Number is not a prime");
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(num + " is Prime Number");
			count++;
		}
		status = true;
	}

	void primeCheck(int iteration) {
		int num1 = 2;
		while (count <= iteration && num1 >= 2) {
			primeNoRange(num1);
			num1++;
		}
	}

	public static void main(String[] args) {
		NprimeNumberOptimized nprimeNumOptimized = new NprimeNumberOptimized();
		nprimeNumOptimized.primeCheck(10);
		// primeNumInRange1.primeNoRange(10);

	}

}
