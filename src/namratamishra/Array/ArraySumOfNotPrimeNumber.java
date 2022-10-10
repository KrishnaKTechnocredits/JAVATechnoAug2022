/*
Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
*/
package namratamishra.Array;

class ArraySumOfNotPrimeNumber {
	boolean isPrime(int a) {
		boolean flag = true;
		for (int k = 2; k < a / 2; k++) 
		{
			if (a % k == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		ArraySumOfNotPrimeNumber asnpn = new ArraySumOfNotPrimeNumber();
		int a[] = { 11, 13, 17, 22, 44 };
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{

			if (!asnpn.isPrime(a[i]))
				sum = sum + a[i];

		}

		System.out.println("Not Prime number sum from the given set of array is: " + sum);
	}
}