/*
 * Replace current index number with 0, if index+1 number is smaller then index number.
 
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}

 */
package anujaD;
import java.util.Arrays;

public class ArrayAssignment22 {
	
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
		ArrayAssignment22 a = new ArrayAssignment22();
		
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("Original Array is: "+ Arrays.toString(input));
		
		int[] output = a.getNumber(input);
		System.out.println("Processed Array is: " +Arrays.toString(output));
	}
}

