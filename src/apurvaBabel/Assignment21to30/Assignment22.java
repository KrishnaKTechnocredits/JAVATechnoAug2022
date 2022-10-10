/*Assignment 22 :
Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/

package apurvaBabel.Assignment21to30;

import java.util.Arrays;

public class Assignment22 {

	int[] getProcessArray(int[] input) {
		for (int index = 0; index < input.length - 1; index++) {
			if (input[index] > input[index + 1]) {
				input[index] = 0;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original array : " + Arrays.toString(input));

		int[] output = assignment22.getProcessArray(input);
		System.out.println("Processed Array :" + Arrays.toString(output));
	}
}
