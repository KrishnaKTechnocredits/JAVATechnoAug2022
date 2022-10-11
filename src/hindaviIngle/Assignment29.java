
/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
package PracticeProgram;
*/
package hindaviIngle;

import java.util.Arrays;

public class Assignment29 {

	int[] shiftZeroAtEnd(int[] intArry) {
		int outputIndex = 0;
		int[] outPut = new int[intArry.length];
		for (int index = 0; index < intArry.length; index++) {
			if (intArry[index] != 0) {
				outPut[outputIndex] = intArry[index];
				outputIndex++;
			}
		}
		return outPut;
	}

	int[] shiftZeroAtbegin(int[] intArry) {
		int[] output = new int[intArry.length];
		int outputIndex = intArry.length - 1;
		for (int index = intArry.length - 1; index >= 0; index--) {
			if (intArry[index] != 0) {
				output[outputIndex] = intArry[index];
				outputIndex--;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29 a1 = new Assignment29();
		int[] intArray = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Input : " + Arrays.toString(intArray));
		int[] outputArr = a1.shiftZeroAtEnd(intArray);
		System.out.println("Shift all Zero's at the end of an array :\n" + Arrays.toString(outputArr));
		int[] out = a1.shiftZeroAtbegin(intArray);
		System.out.println("Shift all zero's at the beginning of the an array :\n" + Arrays.toString(out));

	}

}
