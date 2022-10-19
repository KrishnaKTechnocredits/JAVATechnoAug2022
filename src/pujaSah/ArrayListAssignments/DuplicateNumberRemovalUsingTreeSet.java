/*  Assignment 39 : 15th Oct'2022
Program 5 : Remove duplicates from array containing numbers [natural order/ascending order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]  */

package pujaSah.ArrayListAssignments;

import java.util.Arrays;
import java.util.TreeSet;

class DuplicateNumberRemovalUsingTreeSet {

	// method to remove duplicates from array containing numbers [natural order]
	void displayListAfterDuplicateRemoval(int[] num) {
		System.out.println("Original list of numbers: " + Arrays.toString(num));
		TreeSet<Integer> setOfNumbers = new TreeSet<Integer>();

		for (int number : num) {
			setOfNumbers.add(number);
		}
		System.out.println("Updated list in ascending order with no duplicate numbers: " + setOfNumbers);
	}

	public static void main(String[] args) {
		int[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		new DuplicateNumberRemovalUsingTreeSet().displayListAfterDuplicateRemoval(num);
	}
}