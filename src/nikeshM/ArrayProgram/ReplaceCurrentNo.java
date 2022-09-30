package nikeshM.ArrayProgram;

import java.util.Arrays;

public class ReplaceCurrentNo {
	 static int[] getProcessData(int[] input) {
		for (int index = 0 ; index<input.length-1 ; index++) {
			if (input[index] >input[index+1]) {
				input[index] = 0;
			}
		}
		return input;

	}
	public static void main(String[] args) {
		int [] input = {10,20,30,22,44,21,92,89};
		System.out.println("Orginal Input  :"  + Arrays.toString(input));
		
		int [] output = getProcessData(input);
		System.out.println("Output Array : " + Arrays.toString(output));
	}
}
