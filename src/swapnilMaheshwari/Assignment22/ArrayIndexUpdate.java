
/*
 Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}

 */
package swapnilMaheshwari.Assignment22;

import java.util.Arrays;

public class ArrayIndexUpdate {
	int[] getProcessArray(int[] inputArr) {

		for (int i = 0; i < inputArr.length - 1; i++) {
			if (inputArr[i] > inputArr[i + 1]) {
				inputArr[i] = 0;
			}
		}
		return inputArr;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Orignal Array :" + Arrays.toString(arr));
		int[] output = new ArrayIndexUpdate().getProcessArray(arr);
		System.out.println("Output Array :" + Arrays.toString(output));

	}
}
