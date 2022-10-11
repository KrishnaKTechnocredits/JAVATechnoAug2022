package kiran.assignment30;

import java.util.Arrays;

public class DuplicateElementInArray {
	
	void getDuplicateElementInArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate array elements are : ");
		int[] output=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] &&  i!=j){	
					output[i]=arr[j];
					arr[j]=0;
				}
			}
			if(output[i]>0)
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		DuplicateElementInArray obj=new DuplicateElementInArray();
		int[] input=new int[]{10,12,44,12,77,67,12,44};
		obj.getDuplicateElementInArray(input);

	}

}
