/*
 Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
 */

package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemDupliUsingTreeHashSet {
	TreeSet<Integer> intNumberSet = new TreeSet<Integer>();

	void getDupicatNumSetAsc(int[] intArr) {
		for (int num : intArr) {
			intNumberSet.add(num);

		}
		System.out.println("Duplicat Number in ascending order :" + intNumberSet);
	}

	public static void main(String[] args) {
		int[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Input list :" + Arrays.toString(input));
		new RemDupliUsingTreeHashSet().getDupicatNumSetAsc(input);
	}
}
