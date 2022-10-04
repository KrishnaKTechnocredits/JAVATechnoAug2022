package akankshaVyas.Arraypkg;

import java.util.Arrays;

public class ArrayNum {

	int[] getProcessArray(int[] arr) {

		int[] outArr = new int[arr.length];
		int outIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				outArr[outIndex] = arr[index];
				outIndex++;
			}
		}
		return outArr;
	}

	int getCountOfZero(int[] input) {
		int count = 0;
		for (int index : input) {
			if (index == 0) {
				count++;
			}
		}
		return count;
	}

	int[] getZeroFirstArray(int[] arr) {
		int[] output = new int[arr.length];
		int countZero = getCountOfZero(arr);
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[countZero] = arr[index];
				countZero++;
			}
		}
		return output;
	}
	
	void display() {
		int[] input = { 0, 10, 0, 0, 3, 4, 5, 0, 9, 0, 1, 0 };
		System.out.println("Given array is - " + Arrays.toString(input)+ "\n");
		System.out.println("Processed Array with all zero at end - " + Arrays.toString(getProcessArray(input))+ "\n");
		System.out.println("Processed Array with all zero at start - " + Arrays.toString(getZeroFirstArray(input)));
	}

	public static void main(String[] args) {
		ArrayNum arrayNum = new ArrayNum();
arrayNum.display();
		

	}

}
