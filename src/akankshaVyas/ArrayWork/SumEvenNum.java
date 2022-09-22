/*
3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16
*/

package akankshaVyas.ArrayWork;

public class SumEvenNum {

	int getSumOfEvenNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 15, 6 };
		System.out.println(new SumEvenNum().getSumOfEvenNum(input));
	}

}
