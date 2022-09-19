/*Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/

package manjiri.arrayEx;

import java.util.Arrays;

public class ArrayEx8 {

	int[] getProcessedArray(int[] input) {

		for (int index = 0; index < input.length - 1; index++) {
			if (input[index] > input[index + 1])
				input[index] = 0;
		}
		return input;
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original Array: " + Arrays.toString(inputArr));
		int[] output = new ArrayEx8().getProcessedArray(inputArr);
		System.out.println("Processed Array: " + Arrays.toString(output));
		
		int[] inputArr2 = {0,10,0,20,30,22,44,44,92,89,0,0,104,0,110,101,101,0};
		System.out.println("Original Array: " + Arrays.toString(inputArr2));
		System.out.println("Processed Array: " + Arrays.toString(new ArrayEx8().getProcessedArray(inputArr2)));
	}
}
