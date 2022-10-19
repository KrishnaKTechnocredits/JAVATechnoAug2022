/*Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package adittyThakare.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39_Program6 {
	Set<Integer> removeDuplicatesFromArrayUsingSet(int[] arr) {

		Set<Integer> outputHashSet = new LinkedHashSet<>();
		Set<Integer> outputHashSet1 = new LinkedHashSet<>();

		for (int num : arr) {
			boolean flag=outputHashSet.add(num);
			if(!flag) {
				outputHashSet1.add(num);
			}
		}
		return outputHashSet1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program6 assignment39_Program6 = new Assignment39_Program6();
		int[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Remove duplicates from array containing numbers using Set");
		System.out.println("\nInput array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment39_Program6.removeDuplicatesFromArrayUsingSet(input));
	}

}
