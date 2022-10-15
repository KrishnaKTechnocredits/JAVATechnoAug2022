/*Assignment 39 : 15th Oct'2022
 Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
 */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicateNumbersUsingList {

	// method to remove duplicates from array containing numbers using List.
	void displayListAfterDuplicateRemoval(Integer[] numArr) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		ArrayList<Integer> outList = new ArrayList<Integer>();
		System.out.println("Original list of numbers: " + listOfNum);

		for (int number : numArr) {
			if (listOfNum.indexOf(number) != listOfNum.lastIndexOf(number) && !outList.contains(number)) {
				outList.add(number);
			}
		}
		System.out.println("List of numbers after removing duplicates are: " + outList);
	}

	public static void main(String[] args) {
		Integer[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		new RemoveDuplicateNumbersUsingList().displayListAfterDuplicateRemoval(num);
	}
}