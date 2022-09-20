package komalShrivastava;

import java.util.Arrays;

public class ReplacingValueInArray {
	
	static int[] getReplaceValueInArray(int[] arr) {
		for(int index = 0; index<arr.length-1; index++) {
			if(arr[index] > arr[index+1]) 
				arr[index] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int []input = {10, 20, 30, 22, 44, 21, 92, 89};
		int[] replacedArray = ReplacingValueInArray.getReplaceValueInArray(input);
		System.out.println("Final output for input array " +Arrays.toString(input) + " is \n" + Arrays.toString(replacedArray));
	}
}