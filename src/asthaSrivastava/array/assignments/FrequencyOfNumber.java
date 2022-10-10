/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1*/
package asthaSrivastava.array.assignments;

import java.util.Arrays;

public class FrequencyOfNumber {

	void getFreqOfNum(int[] input) {
		// method to get Frequency of Numbers
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			int num = input[index];
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (num == input[innerIndex]) {
					count++;
					input[innerIndex] = 0;
				}
			}
			if (count >= 1 && input[index] != 0) {
				System.out.println(num + " --> " + count);
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Input array: " + Arrays.toString(num));
		System.out.println("\nFrequency of each number is ");
		new FrequencyOfNumber().getFreqOfNum(num);
	}
}
