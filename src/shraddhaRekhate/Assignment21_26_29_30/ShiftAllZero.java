package shraddhaRekhate.Assignment21_26_29_30;
import java.util.Arrays;
//Assignment 29
//Program 1 : 
//Shift all Zero's at the end of an array.
//
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}
//
//Program 2 : 
//Shift all zero's at the beginning of the an array.
//
//input : {10,0,0,3,4,5,0,9}
//output : {0,0,0,10,3,4,5,9}

public class ShiftAllZero {
	int[] shiftAllZeroAtTheEndOfAnArray(int[] input) {
		int count=0;
		int[] output=new int[input.length];
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[count]=input[index];
				count++;
			}
		}
		return output;
	}

	int[] shiftAllZeroAtTheBeginingOfAnArray(int[] input) {
		int count=0;
		int[] output=new int[input.length];
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				count++;
			}
	    }
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[count]=input[index];
				count++;
			}
	    }
		return output;
	}
	public static void main(String[] args) {
		ShiftAllZero shiftAllZero=new ShiftAllZero();
		int[] input= {10,0,0,3,4,5,0,9};
		System.out.println(Arrays.toString(shiftAllZero.shiftAllZeroAtTheBeginingOfAnArray(input)));
		System.out.println(Arrays.toString(shiftAllZero.shiftAllZeroAtTheEndOfAnArray(input)));
	}

}
