package nikeshM.Assignment_30_Nikesh;

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

public class Assignment30Program1 {

	void getDuplicateNo(int[] arr) {
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[index] == arr[i] && (index != i)) {
					output[index] = arr[index];
					arr[i] = 0;
				}

			}
			if (output[index] > 0) {
				System.out.println("Duplicate no are " +output[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 44, 12, 77, 67, 12, 44 };
		Assignment30Program1 p1 = new Assignment30Program1();
		p1.getDuplicateNo(arr);
	}
}
