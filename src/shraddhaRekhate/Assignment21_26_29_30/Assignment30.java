package shraddhaRekhate.Assignment21_26_29_30;

import java.lang.reflect.Array;
import java.util.Arrays;

//Assignment - 30 : 28th Sep'2022
//
//Find duplicate numbers from given array.
//input : {10,12,44,12,77,67,12,44};
//output : 12
//         44 
//
//Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
//
//
//if(arr[i] == arr[j] && i!=j){
//	arr[j] = 0;
//}
public class Assignment30 {
	void duplicateNumFromGIvenArray(int[] arr) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[index]==arr[j] && index!=j) {
					count=arr[j];
					arr[j]=0;
				}
			}
			if(count>0) {
				System.out.println(count);
			}
		}
	}
public static void main(String[] args) {
	Assignment30 assignment30=new Assignment30();
	int[] arr={10,12,44,12,77,67,12,44};
	System.out.println(Arrays.toString(arr));
	assignment30.duplicateNumFromGIvenArray(arr);
}
}
