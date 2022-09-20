/*
 * Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4
 */
package akankshaVyas.Test;

public class TreeVisibility {

	int getTreeVisiblityCount(int[] arr) {
		int count = 0;int max = 0;
		for (int index = 0; index < arr.length; index++) {
			
			if (max < arr[index]) {
			
				max = arr[index];
				count++;
			}
			}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = { 3, 7, 5 };
		System.out.println(new TreeVisibility().getTreeVisiblityCount(input));
		 int[] input1 = { 3, 5, 11, 9, 10, 13 };
		 System.out.println(new TreeVisibility().getTreeVisiblityCount(input1));
	}
}
