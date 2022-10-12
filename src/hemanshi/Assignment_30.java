/*
Assignment - 30 : 28th Sep'2022
Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44input};
output : 12
         44 
Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}
*/


package hemanshi;
import java.util.Arrays;

public class Assignment_30 {
	
	void getDuplicateArray(int[] input) {
	int replaceNumber = getMaxNumber(input) + 1;
	System.out.println("The replacement num is max+1 of array is - " + replaceNumber);
	System.out.println("The Duplicate in given array  - ");
		int count=0;
		for(int index = 0; index < input.length; index++) {
			count = 0;
			for(int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (index != innerIndex && input[index] == input[innerIndex]) {
					count++;
					input[innerIndex] = replaceNumber;
				}
			}
			if(count > 0 && input[index] != replaceNumber) {
				 System.out.println(input[index]);
			  }
			}
		}
	
	int getMaxNumber(int[] input) {
		int max = 0;
		for(int index = 0; index < input.length; index++) {
			if(max <= input[index]) {
				max = input[index];
			  }
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		int[] input = {10, 33, 20, 10, 12, 77, 67, 77, 44, 25, 44};
		System.out.println("Given array is - " + Arrays.toString(input));
		new Assignment_30().getDuplicateArray(input);
	}

}
     