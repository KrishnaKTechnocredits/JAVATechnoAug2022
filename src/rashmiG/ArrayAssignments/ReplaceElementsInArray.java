/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/

package rashmiG.ArrayAssignments;

import java.util.Arrays;

class ReplaceElementsInArray {

	int[] processedArray(int[] input) {
		for (int index = 0; index < input.length - 1; index++) {
			if (input[index + 1] < input[index]) {
				input[index] = 0;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ReplaceElementsInArray replaceElement = new ReplaceElementsInArray();
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original String --> " + Arrays.toString(input));
		int[] output = replaceElement.processedArray(input);
		System.out.println(Arrays.toString(output));
		// System.out.println("Original String --> " + Arrays.toString(input));

	}
}
