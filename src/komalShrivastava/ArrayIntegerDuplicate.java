//Assignment 3 : 28th Sep 2022

package komalShrivastava;
import java.util.Arrays;

public class ArrayIntegerDuplicate {
	
	//method to print duplicate and non-duplicate numbers from given Integer Array 
	//set isDuplicateRequired as true to print Duplicate numbers
	//set isDuplicateRequired as false to print Unique numbers
	//Assumption: 0 value is not present in integer array.
	
	void printDuplicateNumber(int[] arrInput, boolean isDuplicateRequired) {
		int[] arrOutput = new int[arrInput.length];
		for(int i =0; i<arrInput.length; i++) {
			arrOutput[i] = arrInput[i];
		}
		if(isDuplicateRequired) 
			System.out.println("Duplicate Numbers \nInput : " + Arrays.toString(arrInput) + "\nOutput ");
		for(int index=0; index<arrInput.length; index++) {
			int count = 0;
			for(int j =index+1; j<arrInput.length; j++) {
				if(arrInput[index] == arrOutput[j]) {
					arrOutput[index] = 0;
					arrOutput[j] = 0;
					count++;
				}
			}		
			if(count>0 && isDuplicateRequired)
				System.out.print(arrInput[index] + " ");
		}	
		if(!isDuplicateRequired) {
			System.out.println("Unique Numbers \nInput : " + Arrays.toString(arrInput) + "\nOutput ");
			for(int index =0; index<arrOutput.length; index++) {
				if(arrOutput[index]!=0)
					System.out.print(arrOutput[index] + " ");
			}
		}	
	}

	public static void main(String[] args) {
		ArrayIntegerDuplicate arrayIntegerDuplicate= new ArrayIntegerDuplicate();
		int[] input = {10,12,44,12,77,67,99,5,12,44,12,44,67,13};
		
		//to print duplicate numbers
		arrayIntegerDuplicate.printDuplicateNumber(input, true);
		System.out.println("\n----------------------------------------------------");
		
		//to print unique numbers
		arrayIntegerDuplicate.printDuplicateNumber(input, false);
	}
}