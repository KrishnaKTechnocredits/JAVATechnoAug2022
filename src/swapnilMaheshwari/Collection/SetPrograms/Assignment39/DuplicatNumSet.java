/*
 Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]

 */
package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicatNumSet {
	LinkedHashSet<Integer> intNumberSet = new LinkedHashSet<Integer>();

	void getDupicatNumSet(int[] intArr) {
		for (int num : intArr) {
			intNumberSet.add(num);

		}
		System.out.println("Duplicat Number :" + intNumberSet);
	}

	public static void main(String[] args) {
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Input list :" + Arrays.toString(input));
		new DuplicatNumSet().getDupicatNumSet(input);
	}
}
