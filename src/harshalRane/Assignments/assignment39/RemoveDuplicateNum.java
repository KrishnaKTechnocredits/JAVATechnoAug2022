/*
 * Assignment 39
 * Program 4 : Remove duplicates from array containing numbers [insertion order].
input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
 */

package harshalRane.Assignments.assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNum {
	Set<Integer> removeDuplicateNumbers(int[] input){
		Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		for(int num : input) {
			setOfNumbers.add(num);
		}
		return setOfNumbers;
	}
	
	public static void main(String[] args) {
		RemoveDuplicateNum removeDuplicateNum = new RemoveDuplicateNum();
		int[] input = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("---Remove Duplicate Numbers using LinkedHashSet Insertion Order)-----");
		System.out.println(Arrays.toString(input));
		System.out.println(removeDuplicateNum.removeDuplicateNumbers(input));
	}
}
