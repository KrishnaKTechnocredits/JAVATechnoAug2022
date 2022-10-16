/*Assignment 39 : 15th Oct'2022

Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetRemoveDuplicatesFromNumbArrayInsertionOrder {

	LinkedHashSet<Integer> getUniqueListOfNumbers2(Integer[] input) {
		LinkedHashSet<Integer> uniqueNumbersSet = new LinkedHashSet<Integer>(Arrays.asList(input));
		return uniqueNumbersSet;
	}

	ArrayList<Integer> getUniqueListOfNumbers(int[] input) {
		ArrayList<Integer> listOfUniqueNumbers = new ArrayList<>();
		for (int index = 0; index < input.length; index++) {
			if (!listOfUniqueNumbers.contains(input[index])) {
				listOfUniqueNumbers.add(input[index]);
			}
		}
		return listOfUniqueNumbers;
	}

	ArrayList<Integer> getUniqueListOfNumbers1(Integer[] input) {
		ArrayList<Integer> tempArrayList = new ArrayList<>(Arrays.asList(input));
		ArrayList<Integer> outputArrayList = new ArrayList<>();
		int num = 0;
		for (int index = 0; index < tempArrayList.size(); index++) {
			num = tempArrayList.get(index);
			if (!outputArrayList.contains(num)) {
				outputArrayList.add(num);
				tempArrayList.removeAll(outputArrayList);
				index--;
			}
		}
		return outputArrayList;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.println("OutputUniqueArrayList: "
				+ new SetRemoveDuplicatesFromNumbArrayInsertionOrder().getUniqueListOfNumbers2(input));
	}
}
