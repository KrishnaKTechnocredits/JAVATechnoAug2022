/*
Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
        44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
arr[j] = 0;
}
*/
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment30 {

	void printDuplicatenumber(int[] inarray) {
		int duplicate = 0;
		System.out.println("Duplicate number from array" + Arrays.toString(inarray) + " are: ");
		for (int index = 0; index < inarray.length - 1; index++) {

			for (int outindex = 1; outindex < inarray.length; outindex++) {

				if (inarray[index] == inarray[outindex] && index != outindex) {
					duplicate = inarray[index];
					inarray[outindex] = 0;
				}

			}
			if (duplicate != 0)
				System.out.println(duplicate);
		}

	}

	public static void main(String[] args) {

		Assignment30 Assignment = new Assignment30();

		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };

		Assignment.printDuplicatenumber(input);
	}

}