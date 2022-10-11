/*Program 2 : Print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/

package swatiM.assignment.Assignment_33;

import java.util.Arrays;

class PrintUniqueNum {

	void printUniqueNum(int[] input) {
		System.out.println("Unique numbers from given array");

		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					count++;
				}
			}
			if (count == 0 && i != 0)
				System.out.println("- > " + input[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 2 : Print unique numbers from \ngiven array (having freq 1)");
		System.out.println("---------------------------------------");

		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");

		new PrintUniqueNum().printUniqueNum(input);

	}
	
}