/*Program 5 : Remove duplicates from array containing numbers.

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
*/
package asthaSrivastava.array.assignments.collections39;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesAsc {

	// method to duplicates from array containing numbers
	void removeDuplicateNumAsc(Integer[] arr) {
		System.out.println("Input array is " + Arrays.toString(arr));
		Set<Integer> listOfNum = new TreeSet<Integer>();
		for (Integer num : arr) {
			listOfNum.add(num);
		}
		System.out.println("Removed Duplicates in ascending order" + listOfNum);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		new RemoveDuplicatesAsc().removeDuplicateNumAsc(arr);
	}
}
