package shubhamG.Assignment21to30;

import java.util.Arrays;

/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/
public class Assignment33NumberWithItsFrequency {
	void printNumberWithFrequencyFromArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] > 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j] && i != j) {
						arr[j] = 0;
						count++;

					}
				}
				System.out.println(arr[i] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {

		Assignment33NumberWithItsFrequency frequency = new Assignment33NumberWithItsFrequency();
		int[] input = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("Numbers with its frequency are - ");
		frequency.printNumberWithFrequencyFromArray(input);
	}

}
