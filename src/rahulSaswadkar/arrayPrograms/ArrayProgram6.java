/*
 * Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}

Please go through assignment discussion recording if above requirement is not clear.
 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class ArrayProgram6 {
	public static void main(String[] args) {
		//ArrayProgram6 arrayProgram6 = new ArrayProgram6();
		int[] inputArr = {10,20,30,22,44,21,92,89};
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		//System.out.println("\nOutput Array : " + Arrays.toString(arrayProgram6.getOutputArr(inputArr)));
		System.out.println("\nOutput Array : " + Arrays.toString(new ArrayProgram6().getOutputArr(inputArr)));
	}
    
	int[] getOutputArr(int[] inputArr) {
		
		for(int index = 0; index < inputArr.length - 1; index++)
			if(inputArr[index+1] < inputArr[index]) {
				inputArr[index] = 0;
			}
		return inputArr;
		
		
	}
}
