package nikeshM.ArrayCode;

public class ArrayPrimeNumber {
	int count;
	static int sum = 0;

	int primeNumber(int[] num) {
		int length = num.length;
		int range = 2;
		int tempValue = 0;
		boolean isPrime = true;
		for (int index = 0; index < num.length; index++) {
			tempValue = num[index];
			if (num[index] % range == 0) {
				isPrime = false;
			}

			else {
				sum = sum + (num[index]);
				System.out.println("Prime No Are " + num[index]);
			}
		}
		System.out.println("sum are " + sum);
		return length;
	}

	public static void main(String[] args) {
		ArrayPrimeNumber prime = new ArrayPrimeNumber();
		int[] num = { 11, 14, 17, 21, 22, 44 };
		prime.primeNumber(num);
	}
}
