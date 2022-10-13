//Program 1 : 
//Shift all Zero's at the end of an array.

//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}

//Shift all zero's at the beginning of the an array.

//input : {10,0,0,3,4,5,0,9}
//output : {0,0,0,10,3,4,5,9}

package anujaD;
import java.util.*;

public class Assignment29 {
	
		int[] Array(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				count++;
				output[count -1] = arr[index];
			}
		}
		return output;

	}
		int[] processedArray(int [] arr){ 
	        int [] output = new int [arr.length];
	        int count=0;
	        for (int index=0; index<arr.length; index++){
	            if (arr[index]!=0){ 
	                count++; 
	                output[count+3]= arr[index]; 
	            } 
	        } 
	            return output; 
		}

	public static void main(String[] args) {
		Assignment29 test = new Assignment29();
		
		int[] arr = { 12, 1, 0, 3, 4, 0, -23, 0, 6, 0 };
		int[] result = test.Array(arr);
		System.out.println(Arrays.toString(result));
		
		int [] arr1 = {12,1,0,3,4,0,-23,0,6,0}; 
        int [] result1 = test.processedArray(arr); 
        System.out.println(Arrays.toString(result1)); }

	
}
