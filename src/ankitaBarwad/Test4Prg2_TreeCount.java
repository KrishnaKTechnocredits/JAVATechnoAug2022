/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/
package ankitaBarwad;

import java.util.Arrays;

public class Test4Prg2_TreeCount {

	private int getVisibleTreesCount(int[] treeHeight) {
		int maxHeight = treeHeight[0];
		int count = 1;
		for (int index = 1; index < treeHeight.length; index++) {
			if (maxHeight < treeHeight[index]) {
				maxHeight = treeHeight[index];
				count++;
			}
		}
		return count;
	}

	void printVisibleTreesCount(int[] treeHeights) {
		int totalTreesVisible = getVisibleTreesCount(treeHeights);
		System.out.println(Arrays.toString(treeHeights) + " -> " + totalTreesVisible);

	}

	public static void main(String[] args) {
		Test4Prg2_TreeCount treeCount = new Test4Prg2_TreeCount();

		int[] treeHeights = { 3, 5, 11, 9, 10, 13 };
		treeCount.printVisibleTreesCount(treeHeights);

		int[] treeHeights2 = { 3, 7, 2 };
		treeCount.printVisibleTreesCount(treeHeights2);

		int[] treeHeights3 = { 10, 2, 5, 0, 9 };
		treeCount.printVisibleTreesCount(treeHeights3);
	}
}
