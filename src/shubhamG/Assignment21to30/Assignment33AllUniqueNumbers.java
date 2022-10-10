package shubhamG.Assignment21to30;

import java.util.Arrays;

/*
Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
		 */
public class Assignment33AllUniqueNumbers {
	void printAllUniqueNumberFromArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j] && i != j && arr[j] > 0) {
						arr[j] = 0;
					}
				}
				if (arr[i] > 0)
					System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		Assignment33AllUniqueNumbers allUnique = new Assignment33AllUniqueNumbers();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("All unique numbers in the input Array are - ");
		allUnique.printAllUniqueNumberFromArray(input);
	}

}
