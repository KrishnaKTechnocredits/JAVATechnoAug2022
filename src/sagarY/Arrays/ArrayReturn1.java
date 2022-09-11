package sagarY.Arrays;

import java.util.Arrays;

public class ArrayReturn1 {

	char[] getMiddleChar(String[] inputArray) {
		int startIndex = 0;
		char[] outputArray = new char[inputArray.length];

		for (int index = 0; index < inputArray.length; index++) {
			int strlength = inputArray[index].length();
			if (strlength % 2 == 0) {
				startIndex = strlength / 2 - 1;
				outputArray[index] = inputArray[index].charAt(startIndex);
			} else {
				startIndex = strlength / 2;
				outputArray[index] = inputArray[index].charAt(startIndex);
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		ArrayReturn1 array = new ArrayReturn1();
		String[] arr1 = { "Krishna","Maulik","Aashvi","Technocredits","Harsh" };
		char[] ch = array.getMiddleChar(arr1);
		System.out.println("Input Array - " + Arrays.toString(arr1));
		System.out.println("Output Array with Middle name - ");
		for (int index = 0; index < arr1.length; index++) {
			System.out.println(arr1[index] + "- " + ch[index]);
		}
	}
}
