package kiran.assignmet29;

import java.util.Arrays;

public class ArrayShiftZero {

	void shiftZeroToStartOfArray(int[] input) {
		System.out.println("Input array is: "+Arrays.toString(input));
		int count=0;
		int[] output=new int [input.length];
		for(int i=0;i<input.length;i++) {
			if(input[i]==0)
				count++;
		}
		System.out.println("Zero count : "+count);
		/*int j=0;
		for(int i=0;i<input.length;i++) {
			
			if(i<count) {
				output[j]=0;
				j++;
			}
		}*/
		for(int i=0;i<input.length;i++) {	
			if(input[i]>0){
				output[count]=input[i];
				count++;
			}
		}
			
		System.out.println("Array after shifting zeros to start : "+Arrays.toString(output));
	}

	void shiftZeroToEndOfArray(int[] input) {
		System.out.println("Input array is: "+Arrays.toString(input));
		int[] output=new int [input.length];
		int j=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>0) {
				output[j]=input[i];
				j++;
			}
		}
		System.out.println("Array after shifting zeros to end : "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		ArrayShiftZero obj=new ArrayShiftZero();
		int[] input= {10,0,2,0,0,3,4,5};
		obj.shiftZeroToEndOfArray(input);
		obj.shiftZeroToStartOfArray(input);
		
	}

}
