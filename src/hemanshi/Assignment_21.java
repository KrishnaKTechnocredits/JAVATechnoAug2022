package hemanshi;

import java.util.Arrays;

public class Assignment_21{
	
	int secondHighest(int [] inputArray) {
		int max = inputArray[0];
		int secondmax = inputArray[1];
		
	   for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] >= max)
				max = inputArray[index];
			else if (inputArray[index] >= secondmax)
				secondmax = inputArray[index];
		}
		return secondmax;
		
	

}
	public static void main(String args[]) {
		Assignment_21 assignment_21 = new Assignment_21();
		
		int [] input = {12,95,44,33,90,99};
		System.out.println("The highest number from given input is:");
		System.out.println("Input array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment_21.secondHighest(input));

	
		
				
		
	}

}
