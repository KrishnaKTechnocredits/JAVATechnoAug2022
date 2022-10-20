/*Program 4 : Remove duplicates from array containing numbers.
0-
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
*/
package asthaSrivastava.array.assignments.collections39;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates1 {

	//method to duplicates from array containing numbers
	void removeDuplicateNums(Integer[] arr) {
		System.out.println("Input array is " + Arrays.toString(arr));
		LinkedHashSet<Integer> listOfNum = new LinkedHashSet<Integer>();
		for (Integer num : arr) {
			listOfNum.add(num);
		}System.out.println(listOfNum);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		new RemoveDuplicates1().removeDuplicateNums(arr);
	}
}
