package gauravSahu;

import java.util.Arrays;

public class Assignment22 {
	
	int[] toReplace(int[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=0;
			}
		}return arr;
	}
	
	public static void main(String[] args) {
		Assignment22 a1 = new Assignment22();
		int[] arr = {10,20,30,22,44,21,92,89};
		int[] newarr = a1.toReplace(arr);
		System.out.println("Input array is  " + Arrays.toString(arr));	
		System.out.println("Output array is " + Arrays.toString(newarr));	
	}

}
