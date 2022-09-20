/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
 */

package sagarY.assignement24;
import java.util.Arrays;

public class Assignment24 {

	int[] replaceNumWithRemainigSum(int[] num) {
		int sum = 0;
		int[] output = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		for (int i = 0; i < num.length; i++) {
			output[i] = sum - num[i];
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("Assignment24_Write a method to replace element \nwith sum of other elements.");
		System.out.println("************************************************");
		int[] num = { 12, 2, 11, 17 };
		System.out.println("Input: " + Arrays.toString(num) + "\n");
		int[] output = new Assignment24().replaceNumWithRemainigSum(num);
		System.out.println("Output:" + Arrays.toString(output));
	}

}
