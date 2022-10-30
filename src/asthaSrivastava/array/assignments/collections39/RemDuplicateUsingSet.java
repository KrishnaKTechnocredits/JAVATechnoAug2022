/*Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package asthaSrivastava.array.assignments.collections39;

import java.util.*;

public class RemDuplicateUsingSet {

	// method to remove duplicates using Set
	void getDuplicatesFromArray(Integer[] arr) {
		System.out.println("Input array is " + Arrays.toString(arr));
		Set<Integer> listOfNum = new HashSet<Integer>();
		Set<Integer> listOfNumnew = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (!listOfNum.add(num))
				listOfNumnew.add(num);
		}
		System.out.println("Array after removing duplicates from array is " + listOfNumnew);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		new RemDuplicateUsingSet().getDuplicatesFromArray(arr);
	}
}
