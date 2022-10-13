/*
Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89

*/
package namratamishra.Array;

class ArraySecondHighestNumber {

	void m1(int[] arr) {

		int max = 0;
		int smax = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > max) {
				smax = max;
				max = arr[i];

			} else if (arr[i] < max && arr[i] > smax) {
				smax = arr[i];
			}

		}

		System.out.println("Second Highest from the given set of array is: " + smax);
	}

	public static void main(String[] args) {
		int a[] = {10,99,33,44,89,76};
		ArraySecondHighestNumber abm = new ArraySecondHighestNumber();
		abm.m1(a);

	}
}