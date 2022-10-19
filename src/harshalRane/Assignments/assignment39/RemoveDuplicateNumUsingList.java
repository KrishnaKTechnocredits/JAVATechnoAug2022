/*
 * Assignment 39
 * Program 7 : Remove duplicates from array containing numbers using List.
input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
 */
package harshalRane.Assignments.assignment39;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumUsingList {
	ArrayList<Integer> removeDuplicateNumbersUsingList(Integer[] input) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for (int num : listOfNumbers) {
			if (listOfNumbers.indexOf(num)!=listOfNumbers.lastIndexOf(num) && !output.contains(num)) {
				output.add(num);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		RemoveDuplicateNumUsingList removeDuplicateNumUsingList = new RemoveDuplicateNumUsingList();
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("---Remove Duplicate Numbers using List -----");
		System.out.println(Arrays.toString(input));
		System.out.println(removeDuplicateNumUsingList.removeDuplicateNumbersUsingList(input));
	}
}
