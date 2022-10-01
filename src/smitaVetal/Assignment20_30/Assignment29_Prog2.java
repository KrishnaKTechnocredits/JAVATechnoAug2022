/*

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package smitaVetal.Assignment20_30;

import java.util.Arrays;

public class Assignment29_Prog2 {

	int[] getNum(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				count++;
			}
		}
		for (int innerIndex = 0;innerIndex<input.length;innerIndex++) {
			if(input[innerIndex]!=0) {
				output[count]=input[innerIndex];
				count++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment29_Prog2 prog = new Assignment29_Prog2();
		int[] input = {10,0,0,3,4,5,0,9};
		System.out.println("Input array is : "+Arrays.toString(input));
		int[] output = prog.getNum(input);
		System.out.println("Output after shifting zeros at start is : " +Arrays.toString(output));
	}
	

}
