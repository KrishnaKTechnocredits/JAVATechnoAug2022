/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4 */

package sagarY.test4sept11;

import java.util.Arrays;

public class CountOfVisibleTrees {

	int countOfVisibleTrees(int[] input) {
		int count = 0;
		int maxHeight = 0;

		for (int i = 0; i < input.length; i++) {
			if (maxHeight < input[i]) {
				maxHeight = input[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Program 2: Return count of visible trees.");
		System.out.println("*****************************************");

		int[] inputArray = { 3, 7, 5 };
		System.out.println("Elements of the first array are: " + Arrays.toString(inputArray));
		int input1 = new CountOfVisibleTrees().countOfVisibleTrees(inputArray);
		System.out.println("Count of visible trees are: " + input1 + "\n");

		int[] inputArray1 = { 3, 5, 11, 9, 10, 13};
		System.out.println("Elements of the second array are: " + Arrays.toString(inputArray1));
		int input2 = new CountOfVisibleTrees().countOfVisibleTrees(inputArray1);
		System.out.println("Count of visible trees are: " + input2);
	}
}
