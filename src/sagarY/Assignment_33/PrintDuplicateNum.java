/*Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
*/

package sagarY.Assignment_33;
import java.util.Arrays;

class PrintDuplicateNum {

	void printDuplicateNum(int[] input) {
		System.out.println("Duplicate numbers from given array.");

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i] != 0) {
					if (input[i] == input[j] && i != j) {
						System.out.println(": " + input[i]);
						input[j] = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 1: Print duplicate \nnumbers from given array.");
		System.out.println("----------------------------------");
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("----------------------------------");
		new PrintDuplicateNum().printDuplicateNum(input);

	}

}