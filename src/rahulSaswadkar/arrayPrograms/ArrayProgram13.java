/*
 * Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44
 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class ArrayProgram13 {
	public static void main(String[] args) {
		ArrayProgram13 arrayProgram13 = new ArrayProgram13();
		
		int[] inputArr1 = {10,12,44,12,77,67,12,44};
		int[] inputArr2 = {10,12,44,12,77,67,12,44};
		int[] inputArr3 = {10,12,44,12,77,67,12,44};
		
		System.out.println("Input Integer Array : " + Arrays.toString(inputArr1));
		System.out.println("\n\"Using 0\" - \nDuplicate Numbers in given Array are as below : " );
		arrayProgram13.findDuplicateNumsInArrUsing0(inputArr1);
		System.out.println("\n\"Using Minimum Number\" - \nDuplicate Numbers in given Array are as below : " );
		arrayProgram13.findDuplicateNumsInArr1UsingMinNum(inputArr2);
		System.out.println("\n\"Using Maximum Number\" - \nDuplicate Numbers in given Array are as below : " );
		arrayProgram13.findDuplicateNumsInArr1UsingMaxNum(inputArr3);
		
	}
	
	void findDuplicateNumsInArrUsing0(int[] arr) {
		boolean isDuplicate = false;
		for(int index = 0; index < arr.length ; index++) {
			isDuplicate = false;
			if(arr[index] != 0) {
				for(int innerIndex = index +1 ; innerIndex < arr.length ; innerIndex++) {
					if(arr[index] == arr[innerIndex]) {
						arr[innerIndex] = 0;
						isDuplicate = true;
					}
				}
				if(isDuplicate) {
					System.out.println(arr[index]);
				}
				
			}
		}
	}
	
	int minNumInArr(int[] num) {
		int minNum = num[0];
		
		for(int index = 1; index < num.length ; index++) {
			if(num[index] < minNum ) {
				minNum = num[index];
			}
		}
		//System.out.println("Min Number : " + minNum);
		return minNum;
	}
		
	void findDuplicateNumsInArr1UsingMinNum(int[] arr) {
			boolean isDuplicate = false;
			for(int index = 0; index < arr.length ; index++) {
				isDuplicate = false;
				if(arr[index] != minNumInArr(arr) - 1) {
					for(int innerIndex = index +1 ; innerIndex < arr.length ; innerIndex++) {
						if(arr[index] == arr[innerIndex]) {
							arr[innerIndex] = minNumInArr(arr) - 1;
							isDuplicate = true;
						}
					}
					if(isDuplicate) {
						System.out.println(arr[index]);
					}
				}
			}
	}
	
	int maxNumInArr(int[] num) {
		int maxNum = num[0];
		
		for(int index = 1; index < num.length ; index++) {
			if(num[index] > maxNum ) {
				maxNum = num[index];
			}
		}
		//System.out.println("Max Number : " + maxNum);
		return maxNum;
	}
			
	void findDuplicateNumsInArr1UsingMaxNum(int[] arr) {
		boolean isDuplicate = false;
		for(int index = 0; index < arr.length ; index++) {
			isDuplicate = false;
			if(arr[index] != maxNumInArr(arr) + 1) {
				for(int innerIndex = index +1 ; innerIndex < arr.length ; innerIndex++) {
					if(arr[index] == arr[innerIndex]) {
						arr[innerIndex] = maxNumInArr(arr) + 1;
						isDuplicate = true;
					}
				}
				if(isDuplicate) {
					System.out.println(arr[index]);
				}
						
			}
					
		}
	}
	
	
}
