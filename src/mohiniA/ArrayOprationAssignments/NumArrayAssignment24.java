package mohiniA.ArrayOprationAssignments;

/********Assignment - 24 : 17th Sep'2022 
[program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}
********/

import java.util.Arrays;

public class NumArrayAssignment24 {
	
	int[] getSumofDigits(int[] num){
		int[] output=new int[num.length];
		
		for(int index=0;index<num.length;index++){
			int sum=0;
			for(int index1=0;index1<num.length;index1++){
				
				if(index!=index1)
					sum +=num[index1];				
			}
			output[index]=sum;			
		}
		
		return output;
	}
	
	
	
	
	public static void main(String[] args){
		int[] input = {12,2,11,17};
		System.out.println("Replace element with sum of other elements of digits of input array"+Arrays.toString(input)+" is :");
		System.out.println("\n" +Arrays.toString(new NumArrayAssignment24().getSumofDigits(input)));
		
		
		
	}

}
