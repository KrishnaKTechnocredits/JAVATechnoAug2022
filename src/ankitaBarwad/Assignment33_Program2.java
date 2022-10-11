/*Assignment - 33 : 10th Oct'2022
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program2 {

	// Program 2 : print unique numbers from given array (having freq 1).
	void printUniqueNumberFromArray(int[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = 0; index < inputArray.length; index++) {
			boolean isUnique = true;
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index] == inputArray[innerIndex]) && inputArray[innerIndex] != 0) {
					isUnique = false;
					inputArray[innerIndex] = 0;
				}
			}
			if ((isUnique) && (inputArray[index]) != 0) {
				System.out.println(inputArray[index]);
			}
		}
	}

	public static void main(String[] args) {

		Assignment33_Program2 program2 = new Assignment33_Program2();
		System.out.println("Program 2 : print unique numbers from given array (having freq 1)");
		int[] inputArray2 = { 10, 20, 10, 10, 44, 33, 55, 33 };
		program2.printUniqueNumberFromArray(inputArray2);
	}
}