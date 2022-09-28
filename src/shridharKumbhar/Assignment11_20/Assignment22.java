/*
 * Replace current index number with 0 if index+1 number is 
 * smaller than index number
 * int[] arr ={10,20,30,22,44,21,92,89}
 * output :{10,20,0,22,0,21,0,89}
 */

package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Assignment22 {
	
	int[] getArrayProcess( int[] arr ) {
		
		int[] output = new int[arr.length];
		
		for (int i=0; i< arr.length - 1; i++ ) {
			if(arr[i] > arr[i+1]) {
				output[i]=0;
			}else
				output[i]=arr[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("input :"+ Arrays.toString(input));
		
		System.out.println("Output: "+ Arrays.toString(new Assignment22().getArrayProcess(input)));
	}

}
