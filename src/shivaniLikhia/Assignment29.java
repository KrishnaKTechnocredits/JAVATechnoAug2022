/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package shivaniLikhia;
import java.util.Arrays;

public class Assignment29 {

	void shiftAllZerosAtEnd(int[] arr) {
		int[] output = new int[arr.length] ;
		int j =0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0) {
				output[j]=arr[index];
				j++;
			}
		}
		System.out.println("The output array is : "+Arrays.toString(output));
	}
	
	void shiftAllZerosAtStart(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==0) {
				count++;
			}
		}
		for(int index1=count;index1<arr.length;index1++) {
			if(arr[index1]!=0) {
				output[count] = arr[index1];
				count++;
			}
		}
		System.out.println("The output array is : "+Arrays.toString(output));
	}

	
	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		int[] input = {10,0,0,3,4,5,0,9};
		assignment29.shiftAllZerosAtEnd(input);
		assignment29.shiftAllZerosAtStart(input);
	}
}
