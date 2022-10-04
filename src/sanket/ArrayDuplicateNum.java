/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement strategy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}

*/


package sanket;

import java.util.Arrays;

public class ArrayDuplicateNum {
	void getDuplicateNumberInArray(int[] arr) {
		int[] temp = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			for (int j = index + 1; j < arr.length; j++) {
				if (arr[index] == arr[j] && index != j) {
					temp[index] = arr[j];
					arr[j] = 0;
				}
			}
			if (temp[index] > 0) {
				System.out.println(temp[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("The duplicate numbers are in number array " + Arrays.toString(input) + " is : ");
		new ArrayDuplicateNum().getDuplicateNumberInArray(input);
	}
}
