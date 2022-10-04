package shubhamG.Assignment11to20;

/*Assignment - 15 : 5th Sept 2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
*/

public class PrimeNumberWithReturn {
	int count = 0;
	static int sum = 0;

	boolean primeNumbersReturn(int num) {
		boolean primeFlag = true;
		int index = 2;

		while (index <= (num / 2)) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
			index++;
		}
		if (primeFlag) {
			count++;
			sum = sum + num;
		}
		return true;
	}

	int printFirstN(int N) {
		int num = 2;
		System.out.println("Sum of First " + N + " Prime numbers are");
		while (num >= 2 && count < N) {
			primeNumbersReturn(num);
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {

		new PrimeNumberWithReturn().printFirstN(5);
		System.out.println(sum);
	}

}
