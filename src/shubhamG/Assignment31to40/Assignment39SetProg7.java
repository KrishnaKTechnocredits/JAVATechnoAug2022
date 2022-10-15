package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;

/*
Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
*/
public class Assignment39SetProg7 {
	ArrayList<Integer> returnDuplicateNumberUsingList(Integer[] arr) {
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(arr));
		for (int num : input) {
			if (input.indexOf(num) != input.lastIndexOf(num)) {
				if (!duplicate.contains(num)) {
					duplicate.add(num);
				}
			}
		}
		return duplicate;
	}

	public static void main(String[] args) {
		Assignment39SetProg7 duplicateNumber1 = new Assignment39SetProg7();

		Integer[] arr = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input Array is : \n" + Arrays.toString(arr));

		ArrayList<Integer> output = duplicateNumber1.returnDuplicateNumberUsingList(arr);
		System.out.println("\nDuplicate number from given input list is: \n" + output);
	}

}
