/********
 * Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 


 * *******/

package mohiniA.ArrayOprationAssignments;

import java.util.Arrays;

public class DupeNumAssign30 {
	
	void getMinDigit(int[] digit) {
		int min = digit[0];
		for (int index = 1; index < digit.length; index++) {
			if (min > digit[index]) {
				min = digit[index];
			}
		}
		for (int index = 0; index < digit.length; index++) {
			int count = 0;
			for (int index1 = index + 1; index1 < digit.length; index1++) {
				if (digit[index] == digit[index1] && index != index1) {
					digit[index1] = --min;
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(digit[index]);
			}
		}
	}

	public static void main(String[] args) {
		DupeNumAssign30 obj = new DupeNumAssign30();
		int[] num = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Input array is: " + Arrays.toString(num));
		System.out.println("----------------------------------------------------------");
		System.out.println("Duplicate numbers are: " );
		obj.getMinDigit(num);
	}


}
