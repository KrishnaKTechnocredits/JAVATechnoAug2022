package gauravSahu.practiceJanuray2023;

import java.util.Arrays;

public class practice17 {
	
	public static void main(String[] args) {
		int[] input = {12,2,11,17};
		
		int [] arr = new int[input.length];
		
		for(int i = 0; i<input.length;i++) {
			int sum = 0;
			for(int j = 0 ; j<input.length ; j++) {
				if(i!=j) {
					sum = sum + input[j];
				}arr[i] = sum;
			}
		}System.out.println(Arrays.toString(arr));
	}

}
