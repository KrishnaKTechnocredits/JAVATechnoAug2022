package rohini.arrayAssignments;
//Assignment 22: Replace current index number with 0, if index+1 number is smaller then index number.
import java.util.Arrays;

public class Assignment22 {
	int[] replaceNum(int[] input) {
		for (int index = 0; index < input.length - 1; index++) {
			if (input[index + 1] < input[index]) {
				input[index] = 0;
			}
		}
		return input;
	}
	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Input Array: " + Arrays.toString(input));
		int[] output = new Assignment22().replaceNum(input);
		System.out.println("Output Array: " + Arrays.toString(output));
	}
}
