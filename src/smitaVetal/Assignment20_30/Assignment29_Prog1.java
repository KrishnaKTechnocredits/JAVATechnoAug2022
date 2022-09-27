/*Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}
*/


package smitaVetal.Assignment20_30;

import java.util.Arrays;

public class Assignment29_Prog1 {
	
	
	int[] getZerosAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex =0;
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment29_Prog1 prog = new Assignment29_Prog1();
		int[] input = {10,0,0,3,4,5,0,9};
		System.out.println("Given Array is :" +Arrays.toString(input));
		int[] output = prog.getZerosAtEnd(input);
		System.out.println("Output after shifting zeros at end :"+Arrays.toString(output));
	}
}
