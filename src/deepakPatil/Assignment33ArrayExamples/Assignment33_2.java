/*
Assignment - 33 : 10th Oct'2022
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55

 */

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_2 {
	
	void printUniqueNumber(int[]arr) {
		
		
		for(int index=0; index<arr.length; index++) {
			boolean status=true;
			for(int innerIndex=0;innerIndex<arr.length;innerIndex++) {
				if(arr[index]==arr[innerIndex] && innerIndex!=index) {
					status=false;					
				}
			}
			if(status)
				System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment33_2 assignment33_2 = new Assignment33_2();
		
		int[]arr={10,20,10,44,33,55,33};
		System.out.println("Given array is "+Arrays.toString(arr));
		System.out.println("Unique number from given array are as below :");
		assignment33_2.printUniqueNumber(arr);
	}

}
