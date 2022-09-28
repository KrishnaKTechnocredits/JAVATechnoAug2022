/*
 * Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 
Hint : 2 for loop, think about replacement strategy (the number you compare, replace that number with other number)
 */
package harshalRane.Assignments.assignment30;

import java.util.Arrays;

public class Assignment30 {
	void getDuplicateNumber(int[] num) {
		int[] output = new int[num.length];
		for(int index=0;index<num.length;index++) {
			for(int innerIndex=index+1;innerIndex<num.length;innerIndex++) {
				if(num[index] == num[innerIndex] && index != innerIndex) {
					output[index] = num[innerIndex];
					num[innerIndex] = 0;
				}
			}
			if(output[index] > 0) {
				System.out.println(output[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int[] input = {10,12,44,12,77,67,12,44};
		System.out.println(Arrays.toString(input));
		assignment30.getDuplicateNumber(input);
	}
}
