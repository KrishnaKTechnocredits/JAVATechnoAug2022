//Return count of visible trees.

package komalShrivastava;

import java.util.Arrays;

public class Test4b {
	
	// Get Count of Visible Trees
	
	int getCountofVisibleTrees(int[] input) {
		int maxHeight = input[0];
		int count = 1;
		for(int i=1; i<input.length; i++) {
			if(maxHeight<input[i]) {
				maxHeight = input[i];
				count++;
			}
		}
		return count;
	}
	
	//Get Array of Visible Trees
	
	int[] getVisibleTrees(int[] input, int count) {
		int maxHeight = input[0];
		int[] visibleTreesArray = new int[count];
		visibleTreesArray[0] = input[0];
		int j = 1;
		for(int index = 1; index < input.length; index++) {
			if(maxHeight<input[index]) {
				maxHeight = input[index];
				visibleTreesArray[j] = input[index];
				j++;
			}
		}
		return visibleTreesArray;
	}
	
	void displayVisibleTrees(int[] input) {
		int countOfVisibleTrees = getCountofVisibleTrees(input);
		int[] visibleTreesArray = getVisibleTrees(input, countOfVisibleTrees);
		System.out.println("Input Array : " + Arrays.toString(input));
		System.out.println("Visible Trees Array : " + Arrays.toString(visibleTreesArray));
		System.out.println("Count : " + countOfVisibleTrees + "\n");
	}

	public static void main(String[] args) {
		Test4b test4b = new Test4b();
		int[] input1 = {3,7,5};
		test4b.displayVisibleTrees(input1);
		
		int[] input2 = {3,5,11,9,10,13};
		test4b.displayVisibleTrees(input2);
	}
}