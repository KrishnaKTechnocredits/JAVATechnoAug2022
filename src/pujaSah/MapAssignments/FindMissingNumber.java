/*Assignment 40 : 16th Oct'2022
Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]*/

package pujaSah.MapAssignments;

import java.util.ArrayList;
import java.util.Arrays;

class FindMissingNumber {

	// method to print missing numbers from give array from 50 to 60
	void displayMissingNumbers(Integer[] numArr1, Integer[] numArr2) {
		ArrayList<Integer> listOfNum1 = new ArrayList<Integer>(Arrays.asList(numArr1));
		ArrayList<Integer> listOfNum2 = new ArrayList<Integer>(Arrays.asList(numArr2));

		System.out.println("Original List: " + listOfNum2);
		listOfNum1.removeAll(listOfNum2);
		System.out.println("List of missing numbers from 50 to 60 are " + listOfNum1);
	}

	public static void main(String[] args) {
		Integer[] list1 = { 50, 51, 52, 53, 54, 55, 56, 57, 57, 58, 59, 60 };
		Integer[] list2 = { 60, 54, 51, 57 };
		new FindMissingNumber().displayMissingNumbers(list1, list2);
	}
}