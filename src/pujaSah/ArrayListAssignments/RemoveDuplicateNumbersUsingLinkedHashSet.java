/* 
Assignment 39 : 15th Oct'2022
Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
*/

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class RemoveDuplicateNumbersUsingLinkedHashSet {

	// method to remove duplicates from array containing numbers [insertion order].
	void displayListAfterDuplicateRemoval(Integer[] num) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(num));
		LinkedHashSet<Integer> setOfNum = new LinkedHashSet<Integer>();
		System.out.println("Original list of numbers: " + listOfNum);

		for (int number : listOfNum) {
			setOfNum.add(number);
		}
		System.out.println("List of numbers after removing duplicates are: " + setOfNum);
	}

	public static void main(String[] args) {
		Integer[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		new RemoveDuplicateNumbersUsingLinkedHashSet().displayListAfterDuplicateRemoval(num);
	}
}