package nikeshM.Assignment24;

import java.util.Arrays;

//Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]
//
//Write a method to replace element with sum of other elements.
//
//input : {12,2,11,17}
//output : {30,40,31,25}

public class Assignment24Program1 {
	int[] getSumOfDigit(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {

			int sum = 0;
			for (int j = 0; j < input.length; j++) {

				if (index!= j) {
					sum = sum +input[j];
				}
				output[index] = sum;
			}
		}
		return output;
	}

	public static void main(String[] args) {
			Assignment24Program1 p1 = new Assignment24Program1();
			int [] input = {12,2,11,17};
			System.out.print("Input Array is: " +Arrays.toString(input));
			int [] output = p1.getSumOfDigit(input);
			System.out.print("\n Output Arrays is: " +Arrays.toString(output));
		}

}
