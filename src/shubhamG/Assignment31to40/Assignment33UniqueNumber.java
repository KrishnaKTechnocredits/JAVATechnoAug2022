package shubhamG.Assignment31to40;

import java.util.Arrays;

/*
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
		 */
public class Assignment33UniqueNumber {

	void printUniqueNumberFromArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j] && i != j && arr[j] > 0) {
						arr[i] = 0;
						arr[j] = 0;
					}
				}
				if (arr[i] > 0)
					System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		Assignment33UniqueNumber unique = new Assignment33UniqueNumber();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("Unique numbers in the input Array are - ");
		unique.printUniqueNumberFromArray(input);
	}

}
