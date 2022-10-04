/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4
*/

package deepakPatil.Test4;

import java.util.Arrays;

public class Test4_2 {

	int getVisibleTreeCount(int[] arr) {
		int highestTree = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highestTree) {
				highestTree = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Test4_2 test4_2 = new Test4_2();

		int[] trees1 = { 3, 7, 5 };
		System.out.println("Given array of height of trees: " + Arrays.toString(trees1));
		System.out.println("Visible trees from given input are " + test4_2.getVisibleTreeCount(trees1));

		int[] trees2 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("\nGiven array of height of trees: " + Arrays.toString(trees2));
		System.out.println("Visible trees from given input are " + test4_2.getVisibleTreeCount(trees2));

	}

}