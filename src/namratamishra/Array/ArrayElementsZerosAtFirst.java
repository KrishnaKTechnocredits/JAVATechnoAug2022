
/* Program 2 :
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
*/

package namratamishra.Array;

public class ArrayElementsZerosAtFirst {

	int[] getArrayElementsZerosAtLast(int[] input) {

		int[] output = new int[input.length];
		int j = input.length - 1;
		for (int i = input.length - 1; i >= 0; i--) {

			if (input[i] != 0) {

				output[j] = input[i];
				j--;
			}

		}

		return output;

	}

	public static void main(String[] args) {
		int input[] = { 10,0,0,3,4,5,0,9 };

		ArrayElementsZerosAtFirst aezal = new ArrayElementsZerosAtFirst();

		int[] output = aezal.getArrayElementsZerosAtLast(input);
		for (int j = 0; j < output.length; j++)
			System.out.print(output[j]);

	}
}
