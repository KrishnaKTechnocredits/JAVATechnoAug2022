package nikitaPhase;
import java.util.Arrays;

public class Assignment_30 {

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
		
		System.out.println("Duplicate members from an array are:");
		
		for (int i = 0; i < output.length; i++) {
			if (output[i] > 0)
				System.out.println("-" + output[i]);
		}
	}

	public static void main(String[] args) {
		
		Assignment_30 find_duplicate = new Assignment_30();
		
		int[] num_arr = { 10, 12, 44, 12, 77, 67, 12, 44 };
		
		System.out.println("Given Array: " + Arrays.toString(num_arr));
		
		find_duplicate.findDuplicateNumFromArray(num_arr);
	}
}
