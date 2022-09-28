package swatiM.assignment.arrayPrograms;

/*Program 2 : Shift all zero's at the beginning of the an array.
input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
*/

import java.util.Arrays;

public class ShiftZeroAtStart {

	void shiftZeroAtEnd(int[] num) {
		int[] output = new int[num.length];
		int count = 3;

		for (int index = 0; index < num.length; index++) {
			if (num[index] != 0) {
				output[count] = num[index];
				count++;
			}
		}
		System.out.println("Output:Shifting all zero's at "
				+ "the beginning of the an array:\n"+Arrays.toString(output));
	}

	public static void main(String[] args) {
		System.out.println("Program 2 : Shift all zero's at the beginning of the an array.");
		
		int[] num = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Given Array is: " + Arrays.toString(num));
		ShiftZeroAtStart assignment29_Prog2 = new ShiftZeroAtStart();
		assignment29_Prog2.shiftZeroAtEnd(num);
	}

}