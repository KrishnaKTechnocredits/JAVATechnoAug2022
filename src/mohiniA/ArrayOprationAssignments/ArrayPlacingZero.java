/**
 * Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
 * **/

package mohiniA.ArrayOprationAssignments;

import java.util.Arrays;

public class ArrayPlacingZero {

	int[] getProcessedArray(int[] num) {

		for (int x = 0; x < num.length - 1; x++) {
			if (num[x] > num[x + 1])
				num[x] = 0;
		}
		return num;
	}

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 22, 44, 21, 92, 89 };

		System.out.println("Original Array" + Arrays.toString(num));
		System.out.println("-----------------------------------------------------------------------");

		int out[] = new ArrayPlacingZero().getProcessedArray(num);
		System.out.println("Output Array" + Arrays.toString(out));

	}

}
