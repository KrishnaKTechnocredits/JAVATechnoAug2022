package chiragPatel;

import java.util.Arrays;

public class Assignment_22 {
	
int [] getModifiedArray(int[]arr) {
			
			for(int i =0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					arr[i]=0;
				}
			}
			return arr;
		}
		
		public static void main(String[]args) {
			
			int[] arr = {10,20,30,22,44,21,92,89};
			System.out.println("Given array is :"+Arrays.toString(arr));
			
			int[]modifiedArr= new Assignment_22().getModifiedArray(arr);
			System.out.println("Output of the array is "+Arrays.toString(modifiedArr));
		}

	}



