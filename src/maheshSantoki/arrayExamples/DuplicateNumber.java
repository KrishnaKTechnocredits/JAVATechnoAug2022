//Assignment - 30 : 28th Sep'2022
//
//Find duplicate numbers from given array.
//input : {10,12,44,12,77,67,12,44};
//output : 12
//         44 
//Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
//if(arr[i] == arr[j] && i!=j){
//	arr[j] = 0;
//}
package maheshSantoki.arrayExamples;

import java.util.Arrays;

public class DuplicateNumber {
	void findDuplicateNumber(int[] input) {
		System.out.println("Duplicate Numbers : ");
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					output[i] = input[j];
					input[j] = 0;
				}
			}
			if (output[i] > 0)
				System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		DuplicateNumber dupnum = new DuplicateNumber();
		int input[] = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Input Array : " + Arrays.toString(input));
		dupnum.findDuplicateNumber(input);
	}
}
