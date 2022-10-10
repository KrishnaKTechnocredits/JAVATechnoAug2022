package vinod.Assignment;

import java.util.Arrays;

public class Assignment30 {
	void getDupNum(int[] arr) {
		int[] output = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					output[i]=arr[j];		
				arr[j] =0;
			}
		}
		if (output[i]>0) {
			System.out.println("Duplicate Number : " + output[i]);
		}
	}
}
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int[] arr = {10,12,44,12,77,12,67};
		System.out.println("Input Arrays is : " + Arrays.toString(arr));
		assignment30.getDupNum(arr);
		
	}
}


