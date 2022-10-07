/*Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
*/
package smitaVetal;

import java.util.Arrays;

public class Assignment33_1 {
	void getDuplicateNo(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			for (int i = index+1; i < arr.length; i++) {
				if (arr[index]==arr[i]) {
					System.out.println(arr[index]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_1 prog = new Assignment33_1();
		int[] input = { 11, 12, 15, 16, 12, 11, 13, 15 };
		System.out.println("Input array is :" +Arrays.toString(input));
		System.out.println("Duplicate numbers in given array is : ");
		prog.getDuplicateNo(input);
		
	}

}
