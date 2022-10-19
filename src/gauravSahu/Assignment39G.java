/*Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
*/
package gauravSahu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment39G {

	void removeDuplicateNumbers(Integer[] input) {
		List<Integer> listOfNum1 = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> listOfNum2 = new ArrayList<Integer>();
		for (int num : listOfNum1) {
			if (!listOfNum2.contains(num) && listOfNum1.indexOf(num) != listOfNum1.lastIndexOf(num)) {
				listOfNum2.add(num);
			}
		}
		System.out.println("Duplicate Number  removed :  " + listOfNum2);

	}

	public static void main(String[] args) {
		Assignment39G a39 = new Assignment39G();
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input array : " + Arrays.toString(input));
		a39.removeDuplicateNumbers(input);
	}
}
