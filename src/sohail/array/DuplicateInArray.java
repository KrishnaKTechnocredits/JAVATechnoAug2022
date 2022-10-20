//Find duplicate numbers from given array.
//input : {10,12,44,12,77,67,12,44};
//output : 12
//         44 
//Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
//if(arr[i] == arr[j] && i!=j){
//	arr[j] = 0;

package sohail.array;

public class DuplicateInArray {
	void getDuplicate(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && index != innerIndex) {
					output[index] = input[innerIndex];
					input[innerIndex]=0;
				}
			}
				if (output[index] > 0) {
					System.out.println("Duplicates are: " + output[index]);
				}

			}

		}

	

	public static void main(String[] args) {
		DuplicateInArray duplicateinarray = new DuplicateInArray();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		duplicateinarray.getDuplicate(input);

	}

}
