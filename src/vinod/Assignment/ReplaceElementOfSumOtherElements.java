package vinod.Assignment;

import java.util.Arrays;

public class ReplaceElementOfSumOtherElements {
	int[] getArrSumOfOtherElements(int[] input) {
		int[] output = new int[input.length];
		
		for (int i=0; i<input.length; i++) {
			int sum = 0;
			for (int j=0; j<input.length; j++) {
				if (i!=j) {
					sum = sum+input[j];
				}
			}
			output[i]= sum;
		}
		return output;
 	}
	public static void main(String[] args) {
		int[] inputArr = {12,2,11,17};
		System.out.println("input array "+ Arrays.toString(inputArr));
		int[] outputArr = new ReplaceElementOfSumOtherElements().getArrSumOfOtherElements(inputArr);
		System.out.println("output array" + Arrays.toString(outputArr) );
	}

}
