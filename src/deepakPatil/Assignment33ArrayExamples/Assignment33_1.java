/*
Assignment - 33 : 10th Oct'2022
Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
 */

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_1{
	
	int getReplaceNum(int[]num){
		
		int minNum=num[0];
		boolean isZeroAvailable=false;
		for(int index=0; index<num.length; index++){
			if(num[index]==0){
				isZeroAvailable=true;
				break;
			}
		}
		
		if(isZeroAvailable){
			for(int index=1; index<num.length; index++){
				if(num[index]<minNum){
					minNum=num[index];
				}
			}
			return minNum-1;
		}else{
			return 0;
		}
	}
	
	void printDuplicateNumbers(int[] input){		
		
		int replaceNum = getReplaceNum(input);
		for(int index=0; index<input.length;index++){
			if(input[index]!=replaceNum){
				for(int innerIndex=index+1;innerIndex<input.length;innerIndex++){
					if(input[index]==input[innerIndex]){
						System.out.println(input[index]);
						input[index]=replaceNum;
					}
				}
			}
		}
	}
	
	public static void main(String[]args){
		
		Assignment33_1 assignment33_1 = new Assignment33_1();
		
		int [] input = {10,20,10,44,33,55,33};
		System.out.println("Given input array is "+Arrays.toString(input));
		System.out.println("Duplicate numbers from given array is: ");
		assignment33_1.printDuplicateNumbers(input);
	}
}
