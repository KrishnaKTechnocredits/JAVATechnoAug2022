/*Assignment - 21 : 14th Sep'2022
Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/


package anujaD;
import java.util.Arrays;
public class Assignment21 {
	
	int getMaxArrayElement(int[] input) {
		int firstMax=input[0];
		int secondMax=input[1];
		
		for(int index=1;index<input.length;index++) {
			if(firstMax<input[index]) {
				secondMax=firstMax;
				firstMax=input[index];
			}
			else if(secondMax<input[index]) {
				secondMax=input[index];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		
		Assignment21 assignment21 = new Assignment21();
		
		int[] input = {10,99,33,44,89,76};

		System.out.println("\nInput array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment21.getMaxArrayElement(input));
		
	}

}

