/*
Assignment - 33 : 10th Oct'2022

program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_3 {

	void printMissingNumber(int[]arr,int startR,int endR) {
		
		for(int index=startR;index<=endR;index++) {
			boolean isNumMissing=true;
			for(int innerIndex=0; innerIndex<arr.length;innerIndex++) {
				if(index==arr[innerIndex]) {
					isNumMissing=false;
					break;
				}
			}
			
			if(isNumMissing)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		
		int[]input={1,3,9,5,6,10};
		int startRange=1;
		int endRange=10;
		System.out.println("Given input array is: ");
		System.out.println(Arrays.toString(input));
		System.out.println("Missing number from given array in the range "+startRange+" to "+endRange+" is as below:");
		new Assignment33_3().printMissingNumber(input, startRange, endRange);
	}
}
