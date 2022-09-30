/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment30 {

	// Method to find and print duplicate numbers in array
	void findDuplicateNumbersFromArray(int[] arr) {
		int tempNum = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					tempNum = arr[innerIndex];
					arr[innerIndex] = 0;
				}
			}
			if (tempNum > 0) {
				System.out.println(tempNum);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30 assignment30 = new Assignment30();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Program to print duplicate numbers in an array!");
		System.out.println("\nInput Array: "+Arrays.toString(input));
		System.out.println("Duplicate Numbers:");
		assignment30.findDuplicateNumbersFromArray(input);
	}

}
