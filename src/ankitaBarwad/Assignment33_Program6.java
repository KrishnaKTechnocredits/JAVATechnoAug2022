/*Assignment - 33 : 10th Oct'2022
Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program6 {

	// Program 6 : print unique numbers from given array (all content uniquely).
	void printUniqueContentsFromArray(int[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = 0; index < inputArray.length; index++) {
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index] == inputArray[innerIndex]) && inputArray[innerIndex] != 0) {
					inputArray[innerIndex] = 0;
				}
			}
			if ((inputArray[index]) != 0) {
				System.out.println(inputArray[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Program6 program6 = new Assignment33_Program6();
		System.out.println("Program 6 : print unique numbers from given array (all content uniquely).");
		int inputArray6[] = { 10, 20, 10, 44, 33, 55, 33 };
		program6.printUniqueContentsFromArray(inputArray6);
	}
}