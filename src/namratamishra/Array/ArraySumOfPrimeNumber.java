package namratamishra.Array;
/*
Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)
*/

class ArraySumOfPrimeNumber {
	boolean isPrime(int a) {
		boolean flag = true;
		for (int k = 2; k < a / 2; k++) {
			if (a % k == 0)

			{
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		ArraySumOfPrimeNumber aspn = new ArraySumOfPrimeNumber();
		int a[] = { 11, 14, 17, 22, 44 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			if (aspn.isPrime(a[i]))
				sum = sum + a[i];

		}

		System.out.println("Prime number sum from the given set of array is: " + sum);
	}
}