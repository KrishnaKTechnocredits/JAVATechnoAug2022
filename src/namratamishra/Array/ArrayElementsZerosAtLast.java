/*Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}
*/
package namratamishra.Array;

public class ArrayElementsZerosAtLast {

	int[] getArrayElementsZerosAtLast(int[] input) {
		int[] output = new int[input.length];
		int j = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++;
			}

		}

		return output;
	}

	public static void main(String[] args) {
		int input[] = {10,0,0,3,4,5,0,9};

		ArrayElementsZerosAtLast aezal = new ArrayElementsZerosAtLast();

		int[] output = aezal.getArrayElementsZerosAtLast(input);
		for (int j = 0; j < output.length; j++)
			System.out.print(output[j]);

	}
}
