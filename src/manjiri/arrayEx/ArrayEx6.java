package manjiri.arrayEx;

import java.util.Arrays;

public class ArrayEx6 {
	
	int[] getNegativeNum(int[] arr) {
		int count = 0;
		int outputArrayIndex = 0;
		
		for(int index = 0;index <arr.length;index++ ) {
			if(arr[index] < 0) {
				count++;
			}
		}
		int[] outputArray = new int[count];		
		for(int index = 0;index <arr.length;index++ ) {
			if(arr[index] < 0) {
				outputArray[outputArrayIndex] = arr[index];
				outputArrayIndex++;
			}
		}
		return outputArray;
	}
	
	public static void main(String[] args) {
		ArrayEx6 arrayEx6 = new ArrayEx6();
		
		int[] inputArray = {2, -78,-22,67,43,23,-66};
		int[] result = arrayEx6.getNegativeNum(inputArray);
		for(int index =0;index <result.length;index++) {
			System.out.println(result[index]);
		}
		System.out.println(Arrays.toString(result));//imp
	}
}
