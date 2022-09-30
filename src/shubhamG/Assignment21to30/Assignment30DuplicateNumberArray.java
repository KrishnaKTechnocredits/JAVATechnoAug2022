package shubhamG.Assignment21to30;
import java.util.Arrays;
public class Assignment30DuplicateNumberArray {

	void getDuplicateFromArray(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					output[i]=arr[j];
					arr[j] = 0;
				}
				
				}
			if (output[i] > 0) {
				System.out.println(output[i]);
			}
			
		}

	}

	public static void main(String[] args) {
		Assignment30DuplicateNumberArray test = new Assignment30DuplicateNumberArray();

		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Input array is :"+ Arrays.toString(input));
		System.out.println("Duplicate numbers in the input strings are - ");
		test.getDuplicateFromArray(input);
	}
}
