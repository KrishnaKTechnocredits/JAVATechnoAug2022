package kiran;

import java.util.Arrays;
/* Program:Replace current index number with 0, if index+1 number is smaller then index number.
 */
public class ArrayTest5 {

	int[] replaceHighNoWtZero(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
			arr[i]=0;
		}return arr;
	}

	public static void main(String[] args) {
		 ArrayTest5 obj1=new ArrayTest5();
		 int[] a1=new int[] {10,20,30,22,44,21,92,89};
		 System.out.println("Input Array :  " +Arrays.toString(a1));
		 int[] output=new int[a1.length];
		 output=obj1.replaceHighNoWtZero(a1);
		 System.out.println("Output Array : "+Arrays.toString(output));

	}

}
