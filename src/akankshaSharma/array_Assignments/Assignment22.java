//Replace current index number with 0, if index+1 number is smaller then index number.
//int[] arr = {10,20,30,22,44,21,92,89};
//output : {10,20,0,22,0,21,0,89}

package akankshaSharma.array_Assignments;

import java.util.Arrays;

public class Assignment22 {

	int[] getProcessedArray(int[] arr) {
		int index = 0;
		for (; index < arr.length - 1; index++) {
			if (arr[index] > arr[index + 1]) {
				arr[index] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment22 array = new Assignment22();
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original Array is " + Arrays.toString(input));
		int[] output = array.getProcessedArray(input);
		System.out.println("Processed Array is " + Arrays.toString(output));
	}
}