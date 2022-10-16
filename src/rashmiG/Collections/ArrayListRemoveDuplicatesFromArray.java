/*Assignment 39 : 15th Oct'2022

Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDuplicatesFromArray {

	ArrayList<Integer> getDuplicateNumberList1(Integer[] input) {
		ArrayList<Integer> duplicateListOfNames = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> outputListOfNames = new ArrayList<Integer>();
		int num = 0;
		for (int index = 0; index < input.length; index++) {
			num = duplicateListOfNames.get(index);
			if (duplicateListOfNames.indexOf(num) != duplicateListOfNames.lastIndexOf(num)
					&& !outputListOfNames.contains(num)) {
				outputListOfNames.add(num);
			}
		}
		return outputListOfNames;
	}

	ArrayList<Integer> getDuplicateNumberList2(Integer[] input) {
		ArrayList<Integer> duplicateListOfNames = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> outputListOfNames = new ArrayList<Integer>();
		int num = 0;
		for (int index = 0; index < input.length; index++) {
			num = input[index];
			if (duplicateListOfNames.indexOf(num) != duplicateListOfNames.lastIndexOf(num)) {
				outputListOfNames.add(num);
				duplicateListOfNames.removeAll(outputListOfNames);
			}
		}
		return outputListOfNames;
	}

	public static void main(String[] args) {
		ArrayListRemoveDuplicatesFromArray numberList = new ArrayListRemoveDuplicatesFromArray();
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("InputArray: " + Arrays.toString(input));
		ArrayList<Integer> outputList1 = numberList.getDuplicateNumberList1(input);
		ArrayList<Integer> outputList2 = numberList.getDuplicateNumberList2(input);
		System.out.println("Approach 1 :: OutputSetOfDuplicateNumbers: " + outputList1);
		System.out.println("Approach 2 :: OutputSetOfDuplicateNumbers: " + outputList2);
	}
}