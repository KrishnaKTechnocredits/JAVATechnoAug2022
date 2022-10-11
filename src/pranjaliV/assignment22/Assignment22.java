/*
  
 Assignment - 22 : 15th Sep'2022 //26mins

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}

Please go through assignment discussion recording if above requirement is not clear.
 
*/

package pranjaliV.assignment22;

import java.util.Arrays;

public class Assignment22 {
	
	int[] getReplaceArray(int[] input) {
		int[] output = new int[input.length];
		for(int i=0; i<input.length-1; i++) {
			if(input[i]>input[i+1]) {//if index+1 number is smaller then index number.
				output[i]=0;
			}
			else if(input[i]<=input[i+1]) {//if index+1 number is not smaller then index number.
				output[i]=input[i];//then copy the index number in the output array
			}
			for(int j=0; j<input.length;j++) {
				if(j==input.length-1) {
					output[j] = input[i+1];// for the last num in input arr cant be compared to index+1, print the last num as same
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment22 arr = new Assignment22();
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("Input: " + Arrays.toString(input) );
		System.out.println("Output: " + Arrays.toString(arr.getReplaceArray(input)) );
	}

}
