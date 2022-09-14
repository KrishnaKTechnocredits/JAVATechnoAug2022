package kiran;

import java.util.Arrays;

public class SecondMaxNum {
    int getsecondHighestNumber(int[] arr) {
   	 int max=0;
   	 int smax=0;
   	 for(int i=0;i<arr.length;i++) {
   		 if(arr[i]>max) {
   			 max=arr[i];
   		 }
   		 else if(arr[i]>smax) {
   			 smax=arr[i];
   		 }
   		
   			 
   	 }return smax;
    }
	public static void main(String[] args) {
		SecondMaxNum obj=new SecondMaxNum();
		int[] a1=new int[] {10,99,33,44,89,76};
		System.out.println(Arrays.toString(a1));
		System.out.println("Second highest number : "+obj.getsecondHighestNumber(a1));
	}

}
