package amolMule.arrayss;

import java.util.Arrays;
/*Write a method to replace element with sum of other elements.
input : {12,2,11,17}
output : {30,40,31,25}
Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */

public class AdditionFirst {
	  int[] getFirstAddition(int[] arr) {
		int[] output = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					sum = sum + arr[j];
				}
			
				output[i] = sum;	
			}
			
			
		}
		return output;
	}

	public static void main(String[] args) {
		AdditionFirst add = new AdditionFirst();
		int[] arr = { 12, 2, 11, 17 };
		int[] output = new int[arr.length];
		output = add.getFirstAddition(arr);
		System.out.println(Arrays.toString(output));
	}

}



