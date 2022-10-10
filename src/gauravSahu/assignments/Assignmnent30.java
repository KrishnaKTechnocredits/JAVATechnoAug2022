/*Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)*/
package gauravSahu.assignments;

import java.util.Arrays;

public class Assignmnent30 {

	void getDupNum(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					output[i] = arr[j];
					arr[j] = 0;
				}
			}
			if (output[i] > 0) {
				System.out.println("Duplicate numbers are : " + output[i] );
			}
		}
	}

	public static void main(String[] args) {
		Assignmnent30 a30 = new Assignmnent30();
		int[] arr = { 10, 12, 44, 12, 77, 44, 12, 67 };
		System.out.println("Input array is : " + Arrays.toString(arr) );
		a30.getDupNum(arr);
		
	}
}
