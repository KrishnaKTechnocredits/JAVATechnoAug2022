package nikitaPhase;

import java.util.Arrays;

public class Assignment_22 {
	
	//method to Replace current index number with 0, if index+1 number is smaller then index number.
	
		int[] getreplacement(int[] arr) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					arr[i] = 0;
				}
			}
			return arr;
		}

		public static void main(String[] args) {
			Assignment_22 array = new Assignment_22();
			int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
			System.out.println("Input array is " + Arrays.toString(input));
			int[] output = array.getreplacement(input);
			System.out.println("After replacement output array is " + Arrays.toString(output));
		}
	}
