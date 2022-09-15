/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/
package asthaSrivastava.arrayBasics;

import java.util.Arrays;

public class ReplaceNum {

	int[] getReplaceNumber(int[] input) {

		for (int index = 0; index < input.length - 1; index++) {
			if (input[index] > input[index + 1]) {
				input[index ] = 0;
			}
		}

		return input;
	}

	public static void main(String[] args) {
		ReplaceNum test = new ReplaceNum();
		int[] input1 = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original Array is " + Arrays.toString(input1));

		int[] output = test.getReplaceNumber(input1);
		System.out.println("Return Array is " + Arrays.toString(output));
	}

}
