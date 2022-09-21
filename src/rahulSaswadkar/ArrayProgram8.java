/*
 * Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 

 */

package rahulSaswadkar;

import java.util.Arrays;

public class ArrayProgram8 {
	public static void main(String[] args) {
		ArrayProgram8 arrayProgram8 = new ArrayProgram8();
		
		int[] num1 = {12,2,11,17};
		int[] num2 = {12,2,11,17};
		arrayProgram8.printNewArray(num1);
		arrayProgram8.processData(num2);
	}
	
	private int getSumOfAllElementsOfArray(int[] num) {
		int sum = 0;
		for(int index = 0 ; index < num.length ; index++) {
			sum = sum + num[index];
		}
		return sum;
	}
	
	void printNewArray(int[] num) {
		System.out.println("Given Integer Array : " +Arrays.toString(num));
		int sum = getSumOfAllElementsOfArray(num);
		for(int index = 0 ; index < num.length ; index++) {
			num[index] = sum - num[index];
		}
		System.out.println("\nApproach 1 - Updated values in Input Array(Using One Array) \nRearranged Integer Array having each element replaced by sum of other elements of Input Array : \n" 
				+ Arrays.toString(num));
	}
	
	void processData(int[] num) {
		int[] y = new int[num.length];
		
		for(int i = 0 ; i < num.length ; i++) {
			int sum = 0;
			for(int j = 0; j < num.length ; j++) {
				if(i != j) {
					sum = sum + num[j];
				}
			}
			y[i] = sum;
		}
		System.out.println("\nApproach 2 - Created new Output Array and using 2 for loops and 2 counters \nRearranged Integer Array having each element replaced by sum of other elements of Input Array : \n" 
				+ Arrays.toString(y));
	}
}
