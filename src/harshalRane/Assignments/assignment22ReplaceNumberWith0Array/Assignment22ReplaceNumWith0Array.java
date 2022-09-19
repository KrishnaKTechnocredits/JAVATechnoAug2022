package harshalRane.Assignments.assignment22ReplaceNumberWith0Array;

import java.util.Arrays;

public class Assignment22ReplaceNumWith0Array {
	
	int[] getNumber(int[] input) {
		int length = input.length;
		
		for(int index=0;index<length-1;index++) {
			if(input[index]>input[index+1]) {
				input[index] = 0;
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment22ReplaceNumWith0Array a = new Assignment22ReplaceNumWith0Array();
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("Original Array is: "+ Arrays.toString(input));
		int[] output = a.getNumber(input);
		System.out.println("Processed Array is: " +Arrays.toString(output));
	}
}
