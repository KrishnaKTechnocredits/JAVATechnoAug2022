/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/

package deepakPatil.Assignment22ArrayExample;

import java.util.Arrays;

public class ArrayAssingment {
	
	int [] getModifiedArray(int[]arr) {
		
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=0;
			}
		}
		return arr;
	}
	
	public static void main(String[]args) {
		
		int[] arr = {10,20,30,22,44,21,92,89};
		System.out.println("Given array is :"+Arrays.toString(arr));
		
		int[]modifiedArr= new ArrayAssingment().getModifiedArray(arr);
		System.out.println("Output of the array is "+Arrays.toString(modifiedArr));
	}

}
