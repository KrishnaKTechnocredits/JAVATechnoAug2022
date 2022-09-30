/*Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/

package rohanNaik.Assignments;

import java.util.Arrays;

public class Assignment22Array {
	
	  int[] getProcessedArray(int[] input) {
		  
		  //int[] output = new int [input.length];
		  //output = input;
		  for(int index = 0; index<input.length-1; index++ ) {
			  
			  
			  if(input[index+1] < input[index]) {
				  input[index] = 0;
			  }
			  //output[index] = input[index];
			  input[index] = input[index];
		  }
		  
		  return input; 
	  }
	 
	
	public static void main(String[] args) {
		Assignment22Array obj = new Assignment22Array();
		
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("Original Array = "+ Arrays.toString(input));
		
		int[] output = obj.getProcessedArray(input);
		System.out.println("Processed Array = "+ Arrays.toString(output));
		
		
	}

}
