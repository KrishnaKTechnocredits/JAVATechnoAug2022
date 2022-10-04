/*Assignment - 30 : Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 
*/

package sagarY.Assignment30;
import java.util.Arrays;

public class FindDuplicateNumsFromArray {

	{
		System.out.println("Assignment - 30 : Find duplicate numbers from given array");
		System.out.println("*********************************************************");
	}

	void findDuplicateNumFromArray(int[] input) {
		int[] output = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					output[i] = input[i];
					input[j] = 0;
				}
			}
		}
		System.out.println("Output: Duplicate members from an array are:");
		for (int i = 0; i < output.length; i++) {
			if (output[i] > 0)
				System.out.println(":" + output[i]);
		}
	}

	public static void main(String[] args) {
		FindDuplicateNumsFromArray find = new FindDuplicateNumsFromArray();
		int[] num = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Given Array is: " + Arrays.toString(num));
		find.findDuplicateNumFromArray(num);
	}
}
