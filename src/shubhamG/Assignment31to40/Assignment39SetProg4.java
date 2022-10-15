package shubhamG.Assignment31to40;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
		*/
public class Assignment39SetProg4 {

	LinkedHashSet<Integer> removeDuplicateNumbers(int[] arr) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		for (int index : arr) {
			numbers.add(index);

		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment39SetProg4 duplicateNumbers = new Assignment39SetProg4();

		int[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Input Array is : \n" + Arrays.toString(num));

		LinkedHashSet<Integer> output = duplicateNumbers.removeDuplicateNumbers(num);
		System.out.println("\nArray after removing duplicate number is: \n" + output);
	}

}
