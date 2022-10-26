/*Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package asthaSrivastava.array.assignments.collections39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemDuplicateUsingList {

	// method to get Duplicates from Array Using List
	void getDuplicatesFromArrayUsingList(Integer[] input) {
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> outputList = new ArrayList<Integer>();
		for (int num : listOfNum) {
			if (!outputList.contains(num) && listOfNum.indexOf(num) != listOfNum.lastIndexOf(num)) {
				outputList.add(num);
			}
		}
		System.out.println("Output array is " + outputList);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input array is " + Arrays.toString(arr));
		new RemDuplicateUsingList().getDuplicatesFromArrayUsingList(arr);
	}
}
