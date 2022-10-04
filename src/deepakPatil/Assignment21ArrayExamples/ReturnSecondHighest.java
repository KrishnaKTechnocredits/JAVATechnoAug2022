/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89
*/

package deepakPatil.Assignment21ArrayExamples;

import java.util.Arrays;

public class ReturnSecondHighest {
	
	int getSecondHighest(int[]arr) {
		int max=0;
		int secondMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int [] nums= {10,99,33,44,89,76};
		System.out.println("Given array is "+Arrays.toString(nums));
		System.out.println("Second higest number form given array is "+new ReturnSecondHighest().getSecondHighest(nums));
	}

}
