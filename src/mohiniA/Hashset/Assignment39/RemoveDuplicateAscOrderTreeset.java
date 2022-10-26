/*
 * Assignment 39
 * Program 5 : Remove duplicates from array containing numbers [natural order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
 */


package mohiniA.Hashset.Assignment39;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateAscOrderTreeset {
	
	
	Set<Integer> removeDuplicateNumbers(int[] input) {
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		for (int num : input) {
			setOfNumbers.add(num);
		}
		return setOfNumbers;
	}

	public static void main(String[] args) {
		RemoveDuplicateAscOrderTreeset removeDuplicateNum = new RemoveDuplicateAscOrderTreeset();
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Remove Duplicate Numbers using TreeSet (Natural Order)");
		System.out.println(Arrays.toString(input));
		System.out.println("--------------------------------------------");
		System.out.println(removeDuplicateNum.removeDuplicateNumbers(input));
	}
}
