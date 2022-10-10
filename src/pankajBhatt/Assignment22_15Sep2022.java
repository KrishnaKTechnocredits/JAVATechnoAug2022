/*Replace current index number with 0, if index+1 number is smaller then index number.
	int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}
*/
package pankajBhatt;

import java.util.Arrays;

public class Assignment22_15Sep2022 {
	
	int[] replaceArrayNumbers(int[] inputArr) {
		for(int index = 0; index < inputArr.length - 1; index++ ) {
			if(inputArr[index] > inputArr[index+1]) {
				inputArr[index] = 0;
			}
		}
		return inputArr;
	}

	public static void main(String[] args) {
		int[] inputArr = {10,20,30,22,44,21,92,89};
		System.out.println("Given Array is: "+ Arrays.toString(inputArr));
		Assignment22_15Sep2022 assignment22_15Sep2022 = new Assignment22_15Sep2022();
		int[] arr= assignment22_15Sep2022.replaceArrayNumbers(inputArr);
		System.out.println("Output Array is: "+ Arrays.toString(arr));
	}
}
