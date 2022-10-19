/*Assignment 39 : 15th Oct'2022

Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]*/

package rashmiG.Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class SetRemoveDuplicatesFromNumbArrayINaturalOrder {

	TreeSet<Integer> approach1getUniqueNumbersSet(Integer[] input) {
		TreeSet<Integer> setOfUniqueNumbers = new TreeSet<Integer>(Arrays.asList(input));
		return setOfUniqueNumbers;
	}

	ArrayList<Integer> approach2getUniqueNumbersList(Integer[] input) {
		ArrayList<Integer> listOfUniqueNumbers = new ArrayList<Integer>(Arrays.asList(input));
		Set<Integer> setOfUniqueNumbers = new TreeSet<>(listOfUniqueNumbers);
		listOfUniqueNumbers.clear();
		listOfUniqueNumbers.addAll(setOfUniqueNumbers);
		return listOfUniqueNumbers;
	}

	TreeSet<Integer> approach3getUniqueNumberSet(int[] input) {
		TreeSet<Integer> getUniqueNumberSet = new TreeSet<Integer>();
		for (int num : input) {
			getUniqueNumberSet.add(num);
		}
		return getUniqueNumberSet;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		int[] input1 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.println("Approach 1 :: OutputUniqueSet: "
				+ new SetRemoveDuplicatesFromNumbArrayINaturalOrder().approach1getUniqueNumbersSet(input));
		System.out.println("Approach 2 :: OutputUniqueList: "
				+ new SetRemoveDuplicatesFromNumbArrayINaturalOrder().approach2getUniqueNumbersList(input));
		System.out.println("Approach 3 :: OutputUniqueSet: "
				+ new SetRemoveDuplicatesFromNumbArrayINaturalOrder().approach3getUniqueNumberSet(input1));
	}
}