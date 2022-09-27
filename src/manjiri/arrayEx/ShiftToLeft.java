/*********Shift All zeros to left***********/
//int arr[]={10,20,30,0,-23,0,0,35}
//output=[0, 0, 0, 10, 20, 30, -23, 35]
/*******************************************/

package manjiri.arrayEx;

import java.util.Arrays;

public class ShiftToLeft {
	void ShiftZerosToLeft(int[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		int count = 0;
		
		System.out.println("Input Array is: "+ Arrays.toString(inputArr));
		
		for(int index = 0; index < inputArr.length; index++) {
			if(inputArr[index] == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		for(int index = 0; index < inputArr.length; index++) {
			if(inputArr[index] != 0) {
				outputArr[count] = inputArr[index];
				count++;
			}
		}
		System.out.println("Processed Array is: " + Arrays.toString(outputArr));
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,0,-23,0,0,35};
		ShiftToLeft shiftLeft = new ShiftToLeft();
		shiftLeft.ShiftZerosToLeft(arr);
	}
}
