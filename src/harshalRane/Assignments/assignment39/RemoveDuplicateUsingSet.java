/*
 * Assignment 39
 * Program 6 : Remove duplicates from array containing numbers using Set.
input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
 */
package harshalRane.Assignments.assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
	Set<Integer> removeDuplicateNumbers(int[] input) {
		Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		Set<Integer> output = new LinkedHashSet<Integer>();

		boolean flag = true;
		for (int num : input) {
			flag = setOfNumbers.add(num);
			if (!flag) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		RemoveDuplicateUsingSet removeDuplicateUsingSet = new RemoveDuplicateUsingSet();
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println(Arrays.toString(input));
		System.out.println("---Remove Duplicate Numbers using Set -----");
		System.out.println(removeDuplicateUsingSet.removeDuplicateNumbers(input));
	}
}
