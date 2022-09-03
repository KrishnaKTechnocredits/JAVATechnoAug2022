package shubhamG;

public class PrimeNumberWhileLoop {
	int count = 0;

	void primeNumbers(int num) {
		boolean primeFlag = true;
		int index = 2;
		while (index <= (num/2)) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
			index++;
		}
		if (primeFlag == true) {
			count++;
			System.out.println(num);
		}
	}

	void printFirstN(int N) {
		int num = 2;
		System.out.println("First "+N+" Prime numbers are");
		while (num >= 2 && count < N) {
			primeNumbers(num);
			num++;
		}
	}

	public static void main(String[] args) {

		new PrimeNumberWhileLoop().printFirstN(5);
	}
}
