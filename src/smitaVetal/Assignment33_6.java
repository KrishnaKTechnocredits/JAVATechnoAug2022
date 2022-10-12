/*Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/

package smitaVetal;

import java.util.Arrays;

public class Assignment33_6 {
	
	void printUniqueNumbersFromArrayNew(int[] arr) {
		int replaceNum = 0;

		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					arr[innerIndex] = replaceNum;
				}
			}
			if (arr[index] != 0) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_6 prog = new Assignment33_6();
		int[] arr = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Program to print unique numbers from array");
		System.out.println("\nInput array: " + Arrays.toString(arr));
		System.out.println("\nUnique numbers from array: ");
		prog.printUniqueNumbersFromArrayNew(arr);
	}


}
