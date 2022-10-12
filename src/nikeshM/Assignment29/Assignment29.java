package nikeshM.Assignment29;

import java.util.Arrays;

//Assignment - 29 : 27th Sep'2022
//
//Program 1 : 
//Shift all Zero's at the end of an array.
//
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}

public class Assignment29 {
	int[] getZeroNum(int[] input) {
		int[] output = new int[input.length];
		int outputindex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputindex] = input[index];
				outputindex++;
			}
		}
		return output;
	}
	
	int[] getFirstZeroNum(int[] input) {
		int[] output = new int[input.length];
		int outputindex = 3;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputindex] = input[index];
				outputindex++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment29 p1 = new Assignment29();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.print(" Input Array is  : " + Arrays.toString(input));
		int[] output = p1.getZeroNum(input);
		System.out.println("\n Output Array is " + Arrays.toString(output));
		int[] output1 = p1.getFirstZeroNum(input);
		System.out.println("\n Output Array is " + Arrays.toString(output1));
	}
}
