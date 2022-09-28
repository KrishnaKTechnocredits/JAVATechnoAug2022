package kiran.assignment24SumofElements;

import java.util.Arrays;

public class Assignment24 {
	
	/*Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
*/
	
	void getReplaceSumOfElements(int[] arr) {
		
		int [] output=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum=sum+arr[j];
				}
				output[i]=sum;
			}
			
			
		}
		System.out.println(Arrays.toString(output));
		
	}

	public static void main(String[] args) {
		Assignment24 obj=new Assignment24();
		int[] arr=new int[] {12,2,11,17};
		System.out.println(Arrays.toString(arr));
		obj.getReplaceSumOfElements(arr);

	}

}
