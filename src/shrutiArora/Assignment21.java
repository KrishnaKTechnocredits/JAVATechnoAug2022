/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/
package shrutiArora;

import java.util.Arrays;

public class Assignment21 {
	int getSecondHighestFromArray(int[]input) {
		int max = input[0];
		int secondMax = input[1] ;
		for(int index = 0 ; index<input.length;index++) {
			if(input[index]> max) {
				secondMax = max;
				max = input[index];
			}
			else if(input[index]> secondMax && input[index]!= max ) {
		     	secondMax = input[index];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		System.out.println("*********************************************Second Highest number Program*******************************");
		int[] input =  {10,99,33,44,89,76};
		System.out.println("input: " + Arrays.toString(input));
		System.out.println("Output: " + assignment21.getSecondHighestFromArray(input));
	}
}