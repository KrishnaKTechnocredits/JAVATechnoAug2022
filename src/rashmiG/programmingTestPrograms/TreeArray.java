/*Test 4 - 11th Sep'2022

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/

package rashmiG.programmingTestPrograms;

import java.util.Arrays;

class TreeArray {

	private int getCountOfVisibleTrees(int[] input) {
		int maxHeigth = input[0];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0 && input[index] >= maxHeigth) {
				maxHeigth = input[index];
				count++;
			}
		}
		return count;
	}

	void display(int[] input) {
		System.out
				.println(Arrays.toString(input) + "\n" + "Number of visible trees : " + getCountOfVisibleTrees(input));
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 11, 9, 10, 13 };
		int[] input1 = { 3, 7, 5 };
		TreeArray treeArray = new TreeArray();
		treeArray.display(input);
		treeArray.display(input1);

	}
}