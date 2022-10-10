/*Assignment - 33 : 1st Oct'2022
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {

	void displayUniqueNumbers(int[] input) {
		System.out.println(Arrays.toString(getCopyArray(input)));
		System.out.println("\nOutput");
		for (int index = 0; index < input.length; index++) {
			boolean uniqueNumbFlag = true;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (index != innerIndex && input[index] == input[innerIndex]) {
					uniqueNumbFlag = false;
					break;
				}
			}
			if (uniqueNumbFlag)
				System.out.println(input[index]);
		}
	}

	public int[] getCopyArray(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have in array");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + (index + 1) + " number");
			input[index] = sc.nextInt();
		}
		new UniqueNumbers().displayUniqueNumbers(input);
		sc.close();
//		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
//		UniqueNumbers number = new UniqueNumbers();
//		number.displayUniqueNumbers(input);
	}
}
