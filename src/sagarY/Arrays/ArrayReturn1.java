package sagarY.Arrays;

import java.util.Arrays;

public class ArrayReturn1 {

	char getMiddleChar(String name) {
		char ch = ' ';

		if (name.length() % 2 == 0)
			System.out.println("Middle character of the string is: " + name.charAt(name.length() / 2 - 1));
		else
			System.out.println("Middle character of the string is: " + name.charAt(name.length() / 2));

		return ch;
	}

	String maxLengthName(String[] name) {

		int stringLength = name[0].length();
		String maxLengthName = "";

		for (int index = 1; index < name.length; index++) {
			if (stringLength < name[index].length()) {
				stringLength = name[index].length();
				maxLengthName = name[index];

			}
		}
		System.out.println("Maximum Length String is: " + maxLengthName);
		return maxLengthName;
	}

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
		System.out.println("Program 1:");
		String[] name = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("Input Array - " + Arrays.toString(name));
		String str = new ArrayReturn1().maxLengthName(name);
		char ch1 = new ArrayReturn1().getMiddleChar(str);
		
		System.out.println("\nProgram 2:");
		ArrayReturn1 array = new ArrayReturn1();
		String[] arr1 = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		char[] ch = array.getMiddleChar(arr1);
		System.out.println("Input Array - " + Arrays.toString(arr1));
		System.out.println("Output Array with Middle name - ");
		for (int index = 0; index < arr1.length; index++) {
			System.out.println(arr1[index] + "- " + ch[index]);
		}
			
	}
}
