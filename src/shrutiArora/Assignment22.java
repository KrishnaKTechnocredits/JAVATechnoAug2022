/*ssignment - 22 : 15th Sep'2022

Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/
package shrutiArora;

import java.util.Arrays;

public class Assignment22{
	int[] replaceCurrentIndex(int[]input) {
		for(int index = 0 ; index<input.length-1 ; index++) {
			if(input[index+1]< input[index]) {
				input[index] = 0;
			}
		}
		return input;
	}
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		System.out.println("-------------------------------------------Assignment23-----------------------------------------");
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("input: " + Arrays.toString(input));
		int[] output = assignment22.replaceCurrentIndex(input);
		System.out.println("Output: " + Arrays.toString(output));
	}
}