/*
 Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]

 */
package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class IdentifyDuplicateUsingList {
	void getIdentifyDuplicatUsingList(Integer[] intArr) {
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>(Arrays.asList(intArr));
		ArrayList<Integer> outputListOfNumber = new ArrayList<Integer>();

		for (int num : intArr) {
			if (!outputListOfNumber.contains(num) && listOfNumber.indexOf(num) != listOfNumber.lastIndexOf(num)) {
				outputListOfNumber.add(num);
			}
		}

		System.out.println("Duplicate number list :" + outputListOfNumber);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input list :" + Arrays.toString(input));
		new IdentifyDuplicateUsingList().getIdentifyDuplicatUsingList(input);
	}

}
