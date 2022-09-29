/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/
package shrutiArora;

import java.util.Arrays;

public class Assignment30 {
	void duplicateNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0) {
				boolean isDuplicate = false;
			  for (int j = i + 1; j < array.length; j++) {
				 if (array[i] == array[j] && i != j) {
					  array[j] = 0;
					  isDuplicate = true;
					  
				 }
			  }
			  if(isDuplicate) {
				  System.out.println(array[i]);
			  }
			}
		}
	}
 public static void main(String[] args) {
	   Assignment30 assignment30 = new Assignment30();
	   int[] arr = { 10, 12, 44,12, 77,67, 12, 44 };
	   System.out.println("input: " + Arrays.toString(arr));
	   System.out.println("Output: ");
	   assignment30.duplicateNumbers(arr);
 }
}