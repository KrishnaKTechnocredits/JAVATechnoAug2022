/*
 
Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89

*/

package pranjaliV.assignment21;

import java.util.Arrays;

public class SecondHighestAssignment21 {
	
	int secondHighestNum(int[] input) {
		int max = input[0];
		int secondMax = 0;
		for(int index=0; index<input.length; index++) {
			if(max<input[index]) {
				secondMax = max;
				max=input[index];
			}
			else if(secondMax<input[index]) {
				secondMax = input[index];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		SecondHighestAssignment21 assignment21 = new SecondHighestAssignment21();
		int[] input = {10,99,33,44,89,76};
		System.out.println("Input : "+ Arrays.toString(input));
		System.out.println("Second highest number in the given array is  : "+ assignment21.secondHighestNum(input));
	}
}
