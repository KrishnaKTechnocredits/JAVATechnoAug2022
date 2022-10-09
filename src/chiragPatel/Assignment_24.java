package chiragPatel;

import java.util.Arrays;

public class Assignment_24 {
	
	
		int[] getSumOfDigits(int[] input) {
			int[] output = new int[input.length];
			for(int i=0;i<input.length;i++) 
			{
				int sum=0;
				for(int j=0;j<input.length;j++) 
				{
					if(i!=j) {
						sum = sum + input[j];
					}
					output[i] = sum;
				}
			}
			return output;
		}
		
		
		public static void main(String[] args) {
			Assignment_24 assignment_24 = new Assignment_24();
			int[] input = {12,2,11,17};
			System.out.print("Input Array is: " +Arrays.toString(input));
			int[] output = assignment_24.getSumOfDigits(input);
			System.out.print("\nOutput Array is: " +Arrays.toString(output));
		}
	}


