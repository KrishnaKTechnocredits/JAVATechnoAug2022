//2) Write a method to return sum of all prime numbers from given array.
//input : {11,14,17,22,44}
//output : 28
//Hint : (11+17 = 28)

package sohail.array;

public class ArrayPrime {

	int getArrayPrime(int[] arr) {
		int primesum = 0;
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			for (int indexn = 2; indexn <= arr[index] / 2; indexn++)
				if (arr[index] % arr[indexn] == 0) {
					flag = false;
					break;
				}
			if (false) {
				primesum = primesum + arr[index];
			}
			break;
		}
		System.out.println(primesum);
		return 0;
	}

	public static void main(String[] args) {
		ArrayPrime arrayprime = new ArrayPrime();
		int[] arr1 = { 11, 14, 17, 22, 44 };
		arrayprime.getArrayPrime(arr1);

	}

}
