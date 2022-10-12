package shubhamG.Assignment21to30;

import java.util.Arrays;

public class Assignment29ArrayPractice {

	// Method to return array with all zeroes in end
	int[] getAllZeroesAtEnd(int[] arr) {
		int start = 0; // taken a variable start with initial value as 0
		int end = arr.length - 1;// taken a variable end with initial value as length of input array-1
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) { // applying loop on input array
			if (arr[i] != 0) {
				arr1[start] = arr[i]; // if  value of array at given index is not 0 then it will replace the value
				start++;
			} else {
				arr1[end] = arr[i];// if  value of array at given index is 0 then last element of array takes the value 
				end--; 
			}
		}
		return arr1;
	}
	// Method to return array with all zeroes in start
	int[] getAllZeroesAtStart(int[] arr) {
		int start = 0; // taken a variable start with initial value as 0
		int[] arr2 = new int[arr.length]; // applying loop on input array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr2[start] = arr[i];// if  value of array at given index is 0 then from appending the 0 from 0 index of output array
				start++;
			}
		}
		//applying another loop since till now all the 0 values have taken place in the array
		// now we are iterating through the array again and placing the non 0 elements.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[start] = arr[i];
				start++;
			}
		}
		return arr2;
	}

	public static void main(String[] args) {
		Assignment29ArrayPractice test = new Assignment29ArrayPractice();

		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Given Input array is : " + Arrays.toString(input));
		int[] output1 = test.getAllZeroesAtEnd(input);
		System.out.println("Array restructred with all zeroes in end is : " + Arrays.toString(output1));

		System.out.println("\nGiven Input array is : " + Arrays.toString(input));
		int[] output2 = test.getAllZeroesAtStart(input);
		System.out.println("Array restructred with all zeroes in start is :" + Arrays.toString(output2));
	}

}
