/*
 Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 */

package swapnilMaheshwari.ArrayPrograms;

public class ShiftAllZerosAtTheFirstIndex {
	int[] getShiftAllZerosAtTheFirstIndex(int[] arr) {
		int[] outputArr=new int[arr.length];
		int j=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				j++;
				
			}
		}
		 for(int index=0;index<arr.length;index++){
			 if(arr[index]!=0) {
			 outputArr[j]=arr[index];
		 	 j++;
			 }
		 }
		return outputArr;
	}
	public static void main(String[] args) {
		int[] input={10,0,0,3,4,5,0,9};
		int[] output=new ShiftAllZerosAtTheFirstIndex().getShiftAllZerosAtTheFirstIndex(input);
		for (int index=0; index<input.length;index++) {
			System.out.println(output[index]);
		}
	
}
}
