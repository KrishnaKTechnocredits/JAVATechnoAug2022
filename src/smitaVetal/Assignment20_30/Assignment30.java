/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/

package smitaVetal.Assignment20_30;

import java.util.Arrays;

public class Assignment30 {
	

	void getDuplicateNum(int[] arr) {
		int replaceNum = getMaxNum(arr) + 1;
		System.out.println("The replacement num is max+1 of array is :   " + replaceNum);
		System.out.println("The Duplicate in given array are : ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (index != innerIndex && arr[index] == arr[innerIndex]) {
					count++;
					arr[innerIndex] = replaceNum;
				}
			}
			if (count > 0 && arr[index] != replaceNum) {
				System.out.println(arr[index]);
			}
		}
	}

	int getMaxNum(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (max <= arr[index]) {
				max = arr[index];
			}

		}
		return max;
	}
	public static void main(String[] args) {
		int[] input = { 10, 33, 33, 10, 12, 44, 12, 77, 67, 12, 44, 55, 44 };
		System.out.println("Given array is - " + Arrays.toString(input));
		new Assignment30().getDuplicateNum(input);
		// System.out.println( new ArrayNumDuplicate().getMaxNum(input));
	}

}
