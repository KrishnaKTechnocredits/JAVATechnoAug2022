/*
4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10
*/

package akankshaVyas.ArrayWork;

public class DifferenceNum {

	int getSumOfEvenNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	int getSumOfOddNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 != 0) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	int getDiffernceOfSumEvenOdd(int[] input) {
		int difference = 0;
		if (getSumOfEvenNum(input) > getSumOfOddNum(input))
			difference = getSumOfEvenNum(input) - getSumOfOddNum(input);
		else
			difference = getSumOfOddNum(input) - getSumOfEvenNum(input);
		return difference;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 15, 6 };
		System.out.println(new DifferenceNum().getDiffernceOfSumEvenOdd(input));
	}

}
