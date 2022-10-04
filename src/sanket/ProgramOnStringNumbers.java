/*Assignment 33 – 1st Oct 2022

Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33

Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
		 
program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8

program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc


program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits

Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55

program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/

package sanket;

import java.util.Arrays;

public class ProgramOnStringNumbers {

	// method to print duplicate numbers from given array.
	void getDuplicateNumberInArray(int[] arr) {
		int[] temp = new int[arr.length];

		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[outerIndex] == arr[innerIndex] && outerIndex != innerIndex) {
					temp[outerIndex] = arr[innerIndex];
					arr[innerIndex] = 0;
				}
			}

			if (temp[outerIndex] > 0) {
				System.out.println(temp[outerIndex]);
			}
		}
	}

	// method to print unique numbers from given array (having freq 1).
	void getUniqueNumberInArray(int[] arr) {
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			boolean isUniqueFlag = true;

			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[outerIndex] == arr[innerIndex] && outerIndex != innerIndex) {
					isUniqueFlag = false;
					break;
				}
			}

			if (isUniqueFlag) {
				System.out.println(arr[outerIndex]);
			}
		}
	}

	// method to print missing numbers from given array from range 1 to 10.
	void findMissingNumberInArray(int[] arr) {

		for (int outerIndex = 1; outerIndex <= 10; outerIndex++) {
			boolean isMissingFlag = true;

			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (outerIndex == arr[innerIndex]) {
					isMissingFlag = false;
				}
			}

			if (isMissingFlag) {
				System.out.println(outerIndex);
			}
		}
	}

	// method to print duplicate names from given array (do not consider case
	// sensitivity).
	void getDuplicateStringInArray(String[] str) {

		for (int outerIndex = 0; outerIndex < str.length; outerIndex++) {
			str[outerIndex] = str[outerIndex].toLowerCase();

			for (int innerIndex = outerIndex + 1; innerIndex < str.length; innerIndex++) {
				str[innerIndex] = str[innerIndex].toLowerCase();

				if (str[outerIndex].equals(str[innerIndex]) && outerIndex != innerIndex) {
					System.out.println(str[outerIndex]);
				}
			}
		}
	}

	// method to print unique names from given array.
	void getUniqueStringFromArray(String[] str) {
		for (int outerIndex = 0; outerIndex < str.length; outerIndex++) {
			boolean isUniqueFlag = true;

			for (int innerIndex = outerIndex + 1; innerIndex < str.length; innerIndex++) {
				if (str[outerIndex].equals(str[innerIndex]) && outerIndex != innerIndex) {
					isUniqueFlag = false;
				}
			}
			if (isUniqueFlag)
				System.out.println(str[outerIndex]);
		}
	}

	// method to print unique numbers from given array (all content uniquely).
	void getUniqueNumberInArrayOnce(int[] arr) {
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[outerIndex] == arr[innerIndex] && outerIndex != innerIndex) {
					arr[innerIndex] = 0;
				}
			}

			if (arr[outerIndex] > 0) {
				System.out.println(arr[outerIndex]);
			}
		}
	}
	
	// method to print each number with its frequency. 
	void getCountOfUniqueNumberInArrayOnce(int[] arr) {
		
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			int count=1;
			for (int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[outerIndex] == arr[innerIndex] && outerIndex != innerIndex) {
					arr[innerIndex] = 0;
					count++;
				}
			}

			if (arr[outerIndex] > 0) {
				System.out.println(arr[outerIndex] + "-->" + count);
			}
		}
	}

	public static void main(String[] args) {

		int[] input1 = { 10, 20, 10, 44, 33, 55, 33 };

		System.out.println("***Program 1 Solution***");
		System.out.println("The duplicate numbers are in number array " + Arrays.toString(input1) + " is : ");
		new ProgramOnStringNumbers().getDuplicateNumberInArray(input1);

		System.out.println("\n");

		int[] input2 = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("***Program 2 Solution***");
		System.out.println("The unique numbers are in number array " + Arrays.toString(input2) + " is : ");
		new ProgramOnStringNumbers().getUniqueNumberInArray(input2);

		System.out.println("\n");

		int[] input3 = { 1, 3, 9, 5, 6, 10 };
		System.out.println("***Program 3 Solution***");
		System.out.println("The missing numbers between 1 to 10 are in array " + Arrays.toString(input3) + " is : ");
		new ProgramOnStringNumbers().findMissingNumberInArray(input3);

		System.out.println("\n");

		String[] input4 = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		System.out.println("***Program 4 Solution***");
		System.out.println("The duplicate strings in array " + Arrays.toString(input4) + " is : ");
		new ProgramOnStringNumbers().getDuplicateStringInArray(input4);

		System.out.println("\n");

		String[] input5 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("***Program 5 Solution***");
		System.out.println("The unique strings in array " + Arrays.toString(input5) + " is : ");
		new ProgramOnStringNumbers().getUniqueStringFromArray(input5);

		System.out.println("\n");

		int[] input6 = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("***Program 6 Solution***");
		System.out.println("The unique number at once in array " + Arrays.toString(input6) + " is : ");
		new ProgramOnStringNumbers().getUniqueNumberInArrayOnce(input6);

		System.out.println("\n");

		int[] input7 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("***Program 7 Solution***");
		System.out.println("The frequncy of number at once in array " + Arrays.toString(input7) + " is : ");
		new ProgramOnStringNumbers().getCountOfUniqueNumberInArrayOnce(input7);
	}
}