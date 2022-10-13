/**********Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}

***************/

package mohiniA.ArrayOprationAssignments;
import java.util.*;

public class NumberAtEndAssign29 {
	
	int[] shiftAllZeroInLast(int[] numbers) {
		int[] numArray = new int[numbers.length];
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] != 0) {
				numArray[count] = numbers[index];
				count++;
			}
		}
		return numArray;
	}

	int[] shiftAllZeroBegining(int[] numbers) {
		int[] arr = new int[numbers.length];
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 0) {
				count++;
			}
		}
		for (int index1 = 0; index1 < arr.length; index1++) {
			if (numbers[index1] != 0) {
				arr[count] = numbers[index1];
				count++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		NumberAtEndAssign29 obj = new NumberAtEndAssign29();
		int[] num = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] arr = obj.shiftAllZeroInLast(num);
		System.out.println("Input array is: " + Arrays.toString(num));
		System.out.println("----------------------------------------------------------");
		System.out.println("Output array after shifting 0 at last is: " + Arrays.toString(arr));
		System.out.println("----------------------------------------------------------");
		int[] arr1 = obj.shiftAllZeroBegining(num);
		System.out.println("Output array after shifting 0 at beginning: " + Arrays.toString(arr1));
	}

}
