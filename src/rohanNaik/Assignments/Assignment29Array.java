/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
*/
package rohanNaik.Assignments;

import java.util.Arrays;

public class Assignment29Array {

	int[] shiftEnd(int[] input) {

		int[] arr = input;
		int[] outputarr = new int[arr.length];
		int i = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				outputarr[i] = arr[index];
				i++;
			}
		}
		return outputarr;
	}
	
	int[] shiftStart(int[] input) {

		int[] arr = input;
		int[] outputarr = new int[arr.length];
		int count =0;	
			
			for(int index=0;index<arr.length;index++) {
				if(arr[index]==0){
				count++;
				}
			}
				
			for(int index=0;index<arr.length;index++) {
				if(arr[index] != 0){				
					outputarr[count] = arr[index];
					count++;
				}
			}
			return outputarr;
}
		

	public static void main(String[] args) {
		Assignment29Array obj = new Assignment29Array();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };

		System.out.println("Original Array = " + Arrays.toString(input));
		System.out.println("--------------------------------------------------");

		int[] output = obj.shiftEnd(input);
		System.out.println("Zeros at the end = " + Arrays.toString(output));
		System.out.println("--------------------------------------------------");
		
		int[] output2 = obj.shiftStart(input);
		System.out.println("Zeros at the start = " + Arrays.toString(output2));
	
	}

}
