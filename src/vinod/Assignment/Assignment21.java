package vinod.Assignment;

import java.util.Arrays;

public class Assignment21 {
	int getSecondValueFromArray(int[] arr) {
		int max = arr[0];
		int secondMax = 0;
		for(int i =1; i<arr.length; i++) {
			if (arr[i]>max) {
				secondMax = arr[i];
			}else if (arr[i] <max && arr[i] >secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,21,99,87,81,5};
		System.out.println("Given array is :"+Arrays.toString(arr));
		System.out.println("Second max element from given array is :"+new Assignment21().getSecondValueFromArray(arr));
	}
}
	
	
 
		
	