//1) Write a method to return sum of all numbers in given array.
//input : {10,11,15}
//output : 36

package sohail.array;

import java.util.Arrays;

public class ArraySum {
	int arraysum = 0;
	int max = 0;

	int getArraySum(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arraysum = arraysum + arr[index];
		}
		System.out.println(arraysum);
		return arraysum;
	}

	public static void main(String[] args) {
		ArraySum arraysum = new ArraySum();
		int[] arr1 = { 10, 20, 30, 40, 50 };
		arraysum.getArraySum(arr1);
	}
}
