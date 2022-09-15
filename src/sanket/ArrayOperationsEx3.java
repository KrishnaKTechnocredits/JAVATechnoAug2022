/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/

package sanket;

import java.util.Arrays;

public class ArrayOperationsEx3 {

	int[] getProcessedArray(int[] arr) {

		for (int index = 0; index < arr.length - 1; index++) {
			
			if (arr[index] > arr[index + 1]) {
				
				arr[index] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("The given array is " + Arrays.toString(arr) + ".");
		int[] output = new ArrayOperationsEx3().getProcessedArray(arr);
		System.out.println("\n" + "The processed array is " + Arrays.toString(output) + ".");
	}
}