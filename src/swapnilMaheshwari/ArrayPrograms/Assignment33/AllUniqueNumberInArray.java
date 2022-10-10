/*
 Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
 */
package swapnilMaheshwari.ArrayPrograms.Assignment33;

import java.util.Arrays;

public class AllUniqueNumberInArray {
	void printAllUniqueNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i] && i != j) {
					arr[j] = 0;
				}
			}
			if (arr[i] != 0)
				System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		new AllUniqueNumberInArray().printAllUniqueNumber(input);
	}
}
