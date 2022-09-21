/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package smitaVetal.Assignment20_30;

import java.util.Arrays;

public class Assignment21 {

	//method to get the second highest integer from array
	int getsecondHighestNum(int[] arr) {
		int max = arr[0];
		int secondmax = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		return secondmax;
	}

	public static void main(String[] args) {

		Assignment21 test = new Assignment21();
		int secondmax[] = { 10, 99, 33, 44, 89, 76 };
		int max2 = test.getsecondHighestNum(secondmax);

		System.out.println("Second highest number from give array " + Arrays.toString(secondmax) + " is " + max2);
	}
}