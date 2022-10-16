/*Assignment 39 : 15th Oct'2022

Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/

package rashmiG.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetRemoveNumberDuplicatesFromArray {

	LinkedHashSet<Integer> getDuplicateNumberSet(int[] input) {
		HashSet<Integer> setOfNames = new HashSet<Integer>();
		LinkedHashSet<Integer> duplicateSetOfNames = new LinkedHashSet<Integer>();
		for (int num : input) {
			if (!setOfNames.add(num))
				duplicateSetOfNames.add(num);
		}
		return duplicateSetOfNames;
	}

	public static void main(String[] args) {
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.println(
				"OutputSetOfDuplicateNumbers: " + new SetRemoveNumberDuplicatesFromArray().getDuplicateNumberSet(input));
	}
}