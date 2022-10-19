/*Assignment 39 : 15th Oct'2022
Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]*/
package adittyThakare.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39_Program4 {

	Set<Integer> removeDuplicatesFromArrayInsertionOrder(int[] arr) {

		Set<Integer> outputHashSet = new LinkedHashSet<>();

		for (int num : arr) {
			outputHashSet.add(num);
		}
		return outputHashSet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program4 assignment39_Program4 = new Assignment39_Program4();
		int[] arr={10,10,13,12,12,10,55,66,55,11};
		System.out.println("Remove duplicates from array containing numbers [insertion order]");
		System.out.println("\nInput array: "+Arrays.toString(arr));
		System.out.println("\nOutput: "+assignment39_Program4.removeDuplicatesFromArrayInsertionOrder(arr));
	}

}
