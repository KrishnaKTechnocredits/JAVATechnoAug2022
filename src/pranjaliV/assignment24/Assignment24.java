/*
Assignment - 24 : 17th Sep'2022 //22.11
 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.
input : {12,2,11,17}
output : {30,40,31,25}
Hint : 
12 should be replaced with - 2+11+17  
2 should be replaced with - 12 + 11+ 17   
11 should be replaced with - 12+2+17 
17 should be replaced with - 12+2+11

*/

package pranjaliV.assignment24;
import java.util.Arrays;

public class Assignment24 {
	
	void getArrayOfOtherElements(int[] input){
		int[] output= new int[input.length];//to create array to store members other than give index
		for(int i=0; i<input.length; i++){ // to traverse within the array
			int sum =0;
			for (int j=0;j<input.length;j++){//to store other members of input array in output array
				if(i!=j){
					sum= sum + input[j];
				}
			}
			output[i] = sum;
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment24 arr = new Assignment24();
		int[] input = {12,2,11,17};
		arr.getArrayOfOtherElements(input);
	}
}
