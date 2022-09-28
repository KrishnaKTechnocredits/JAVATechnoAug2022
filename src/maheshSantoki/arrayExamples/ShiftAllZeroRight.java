//Program 1 : 
//Shift all Zero's at the end of an array.
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}

package maheshSantoki.arrayExamples;
import java.util.Arrays;
public class ShiftAllZeroRight {
	int[] shiftAllZeroRight(int[] input) {
		int []output=new int[input.length];
		int outputArrayIndex=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[outputArrayIndex]=input[index];
				outputArrayIndex++;
			}
		}
		return output;
	}
//Program 2 : 
//Shift all zero's at the beginning of the an array.
//input : {10,0,0,3,4,5,0,9}
//output : {0,0,0,10,3,4,5,9}
	
	int countOfZero(int[] input) {
		int countZero = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {//counting Zero for Output array index 
				countZero++;
			}
		}
		return countZero;
	}

	int[] shiftAllZeroLeft(int[] input) {
		int[] output = new int[input.length];
		int outputArrayIndex = countOfZero(input);//Output Array Index 
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputArrayIndex] = input[index];
				outputArrayIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ShiftAllZeroRight zero = new ShiftAllZeroRight();
		int input[] = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Input Array : " + Arrays.toString(input) + "\n");

		int output1[] = zero.shiftAllZeroRight(input);
		System.out.println("All Zero at Right Side : " + Arrays.toString(output1));

		int output2[] = zero.shiftAllZeroLeft(input);
		System.out.println("All Zero At Left Side : " + Arrays.toString(output2));

	}
}
