/*
 * 1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36
 */
package akankshaVyas.Arraypkg;

public class SumofArray {

	int getSumofArrayElement(int[] arr) {
		int sum = 0;
		for (int index = 0; index <= arr.length - 1; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 11, 15 };
		System.out.println(new SumofArray().getSumofArrayElement(arr));
	}
}
