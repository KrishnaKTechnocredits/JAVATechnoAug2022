/*
 * 2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)
 */
package akankshaVyas.Arraypkg;

public class SumOfPrimeNumOfArray {

	boolean isPrimeNum(int num) {
		int index= 2;
		boolean status = true;
		while(index <= num/2) {
			if (num % index == 0) {
				status=false;
				index++;
				break;
			}
			if(status) {
				return true;
			}
		}
		return status;
	}

	int SumOfPrimeArray(int[] arr) {
		int sum = 0;
		{
			for (int index = 0; index < arr.length; index++) {
				if(isPrimeNum(arr[index]))
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 14, 17, 22, 44 };
		System.out.println(new SumOfPrimeNumOfArray().SumOfPrimeArray(arr));
	}
}

