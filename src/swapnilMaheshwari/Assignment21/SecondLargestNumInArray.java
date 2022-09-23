/*
 Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89 
 
 */

package swapnilMaheshwari.Assignment21;

public class SecondLargestNumInArray {

	int getSecondLarNum(int[] arr) {
		int maxNum1 = 0, maxNum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (maxNum1 < arr[i])
				maxNum1 = arr[i];
		}

		for (int j = -0; j < arr.length; j++) {
			if (maxNum1 > arr[j] && maxNum2 < arr[j]) {
				maxNum2 = arr[j];
			}
		}
		return maxNum2;

	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second largest number is" + new SecondLargestNumInArray().getSecondLarNum(input));

	}
}
