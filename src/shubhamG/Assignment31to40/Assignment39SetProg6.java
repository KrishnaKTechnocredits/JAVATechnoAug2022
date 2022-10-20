package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
*/

public class Assignment39SetProg6 {
	
	LinkedHashSet<Integer> returnDuplicateNumber(int[] arr) {
		LinkedHashSet<Integer> duplicate = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> number = new LinkedHashSet<Integer>();
		for (int i : arr) {
			boolean flag = number.add(i);
			if (!flag) {
				duplicate.add(i);
			}
		}
		return duplicate;
	}
	
	public static void main(String[] args) {
		Assignment39SetProg6 duplicateNumber = new Assignment39SetProg6();
		
		int[] arr =  {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input Array is : \n"+Arrays.toString(arr));
		LinkedHashSet<Integer> output = duplicateNumber.returnDuplicateNumber(arr);
		System.out.println("\nDuplicate number from given input list is: \n"+output);
	}

}
