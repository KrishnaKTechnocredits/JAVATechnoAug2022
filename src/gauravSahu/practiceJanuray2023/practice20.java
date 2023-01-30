package gauravSahu.practiceJanuray2023;

import java.util.Arrays;

public class practice20 {
	
	public static void main(String[] args) {
		int[] arr = { 10, 0, 0, 3, 4, 5, 0, 9 }; 
		int num = 0;
		int [] output = new int[arr.length];
		
		for(int index = 0 ; index<arr.length;index++) {
			if(arr[index]!=0) {
				output[num] = arr[index]; 
				num++;
			}
		}
		
		System.out.println(Arrays.toString(output));
		
		int [] output2 = new int[arr.length];
		
		int count = 0;
		
		for(int index2 = 0; index2<arr.length;index2++) {
			if(arr[index2]==0) {
				count ++;
			}
		}
		
		for(int index3 = 0; index3<arr.length;index3++) {
			if(arr[index3] !=0) {
				output2[count] = arr[index3];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(output2));
	} 

}
