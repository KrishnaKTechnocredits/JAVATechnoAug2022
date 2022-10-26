/*Program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
         5 -> 4
         6 -> 2
         4 -> 1
*/

package mohiniA.ArrayOprationAssignments.Assignment33;

import java.util.Arrays;

public class EachNumberFrequency {
	
	void getEachNumberFreq(int[] input) {

		System.out.println("Each Number Frequency from arrays: ");

		for (int i = 0; i < input.length; i++) {
			int count = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					input[j] = 0;
					count++;
				}
			}
			if (input[i] != 0) {
				System.out.println(input[i] + "--" + count);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Print each number with its frequency");
		System.out.println("---------------------------------------");
		int[] input = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");
		new EachNumberFrequency().getEachNumberFreq(input);
	}

}
