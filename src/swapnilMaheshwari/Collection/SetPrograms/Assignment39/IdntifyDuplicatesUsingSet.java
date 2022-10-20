/*
 Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]

 */
package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class IdntifyDuplicatesUsingSet {
	LinkedHashSet<Integer> listOfNum = new LinkedHashSet<Integer>();
	LinkedHashSet<Integer> outputListOfNum = new LinkedHashSet<Integer>();

	void getIdentifyDuplicatesNumUsingSet(int[] intArr) {
		for (int num : intArr) {
			boolean flag = listOfNum.add(num);
			if (!flag) {
				outputListOfNum.add(num);
			}
		}
		System.out.println("Duplicate numbers are :" + outputListOfNum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input list :" + Arrays.toString(input));
		new IdntifyDuplicatesUsingSet().getIdentifyDuplicatesNumUsingSet(input);
	}

}
