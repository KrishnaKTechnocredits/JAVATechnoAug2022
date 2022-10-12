/*Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
		 */
package smitaVetal;

import java.util.Arrays;

public class Assignment33_2 {

	void getUniqueNo(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[index] == arr[j] && index != j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_2 prog = new Assignment33_2();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input array is :" + Arrays.toString(input));
		prog.getUniqueNo(input);
	}
}
