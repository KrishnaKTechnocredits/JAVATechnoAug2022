package namratamishra.Array;
/*
Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

*/
class ArraySumOfNotPrimeNumberandDivby5and7 {
	boolean isPrime(int a) {
		boolean flag = true;
		for (int k = 2; k < a / 2; k++) {
			if (a % k == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		ArraySumOfNotPrimeNumberandDivby5and7 asnpn = new ArraySumOfNotPrimeNumberandDivby5and7();
		int a[] = { 11, 35, 17, 105, 44 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			if (!asnpn.isPrime(a[i]) && (a[i] % 5 == 0 && a[i] % 7 == 0))
				sum = sum + a[i];

		}

		System.out.println(" Not Prime number & Div by 5 and 7, sum from the given set of array is: " + sum);
	}
}