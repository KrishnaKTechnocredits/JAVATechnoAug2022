/*Test 4 - 11th Sep'2022

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Test4_Program2 {
	
	int getTotalTrees(int[] inputArray) {
		int maxheight=inputArray[0],count=1;
		
		for(int index=0;index<inputArray.length;index++) {

			if(maxheight<inputArray[index]) {
				maxheight=inputArray[index];
				//System.out.println(maxheight);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,7,5};
		int[] arr1 = {3,5,11,9,10,13};
		int[] arr2 = {11,5,2,8};
		Test4_Program2 t1 = new Test4_Program2();
		
		System.out.println("Program to count visible trees!");
		int result = t1.getTotalTrees(arr);
		System.out.println("\nInput array: "+Arrays.toString(arr)+"\nVisible tree count: "+result);
		
		int result1 =t1.getTotalTrees(arr1);
		System.out.println("\nInput array: "+Arrays.toString(arr1)+"\nVisible tree count: "+result1);
		
		int result2 =t1.getTotalTrees(arr2);
		System.out.println("\nInput array: "+Arrays.toString(arr2)+"\nVisible tree count: "+result2);
	}
}
