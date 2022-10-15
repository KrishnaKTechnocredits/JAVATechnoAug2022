/*Assignment 39 : 15th Oct'2022
Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11] in any order*/

package pujaSah.ArrayListAssignments;

import java.util.Arrays;
import java.util.HashSet;

class RemoveDuplicateNumbersUsingSet {

	// method to remove duplicates from array containing numbers using Set
	void displayListWithDuplicateNumbers(Integer[] num) {

		HashSet<Integer> listOfNum = new HashSet<Integer>();
		HashSet<Integer> outList = new HashSet<Integer>();

		System.out.println("Original list of numbers: " + Arrays.toString(num));
		for (int number : num) {
			if (!listOfNum.add(number)) {
				outList.add(number);
			}
		}
		System.out.println("List of duplicate numbers being removed: " + outList);
	}

	public static void main(String[] args) {
		Integer[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		new RemoveDuplicateNumbersUsingSet().displayListWithDuplicateNumbers(num);
	}
}