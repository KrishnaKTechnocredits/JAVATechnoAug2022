///Return second highest from given array.
//input : {10,99,33,44,89,76}
//output : 89

package akankshaSharma.array_Assignments;
import java.util.Arrays;

public class Assignment21 {
	int secondHighestNumber(int[] arr) {
		int max = arr[0];
		int smax = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				smax = max;
				max = arr[index];
			} else if (arr[index] > smax) {
				smax = arr[index];
			}

		}
		return smax;
	}

	public static void main(String[] args) {
		Assignment21 array = new Assignment21();
		int[] input = { 10, 99, 33, 44, 89, 76 };
		int output = array.secondHighestNumber(input);
		System.out.println("Second highest number in given array " + Arrays.toString(input) + " is " + output);
	}
}
