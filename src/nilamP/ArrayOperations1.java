/*Assignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/

package nilamP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations1 {

	int[] replaceNum(int[] num) {
		int lenght = num.length;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i + 1]) {
				num[i] = 0;

			}
		}
		return num;
	}

	public static void main(String args[]) {
		ArrayOperations1 ao = new ArrayOperations1();
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Input : " + Arrays.toString(input));
		int[] output = ao.replaceNum(input);
		System.out.println("Output : " + Arrays.toString(output));

	}
}
