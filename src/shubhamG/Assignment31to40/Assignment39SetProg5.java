package shubhamG.Assignment31to40;

import java.util.Arrays;
import java.util.TreeSet;

/*Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
		*/

public class Assignment39SetProg5 {
	TreeSet<Integer> removeDuplicateNumbersAndNaturalOrder(int[] arr) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		for (int index : arr) {
			numbers.add(index);

		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment39SetProg5 duplicateNumbers = new Assignment39SetProg5();

		int[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Input Array is : \n" + Arrays.toString(num));

		TreeSet<Integer> output = duplicateNumbers.removeDuplicateNumbersAndNaturalOrder(num);
		System.out.println("\nArray after removing duplicate number and with natural sorting order is: \n" + output);
	}


}
