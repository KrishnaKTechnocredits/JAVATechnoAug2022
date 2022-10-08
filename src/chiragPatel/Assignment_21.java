package chiragPatel;

import java.util.Arrays;

public class Assignment_21{
	
	int secondHighestNumber(int[] input) {
		int max = input[0];
		int secondMax = 0;
		for(int index=0; index<input.length; index++) {
			if(max<input[index]) {
				secondMax = max;
				max=input[index];
			}
			else if(secondMax<input[index]) {
				secondMax = input[index];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();
		int[] input = {10,99,33,44,89,76};
		System.out.println("Input : "+ Arrays.toString(input));
		System.out.println("Second highest number in Arrey is  : "+ assignment_21.secondHighestNumber(input));
	}
}
