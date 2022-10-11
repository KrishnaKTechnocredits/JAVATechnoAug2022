/*Assignment - 33 : 10th Oct'2022

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
         4 -> 1 */

package pujaSah.assignments31_40;

import java.util.Arrays;

public class ArrayAndString {

	// method to print duplicate numbers from given array.
	void displayDuplicateNumbers(int[] origArr) {
		int[] inArr = new int[origArr.length];
		for (int i = 0; i < origArr.length; i++) {
			inArr[i] = origArr[i];
		}
		boolean duplicateFlag;
		System.out.println("Input array: " + Arrays.toString(inArr));
		System.out.println(" The duplicate numbers in the array are: ");
		for (int index = 0; index < inArr.length; index++) {
			duplicateFlag = true;
			for (int innerIndex = index + 1; innerIndex < inArr.length; innerIndex++) {
				if (inArr[index] == inArr[innerIndex] && inArr[index] != 0) {
					duplicateFlag = false;
					inArr[innerIndex] = 0;
				}
			}
			if (!duplicateFlag) {
				System.out.println(inArr[index]);
				inArr[index] = 0;
			}
		}
	}

	// method to print unique numbers from given array (having freq 1)
	void displayUniqueNumbers(int[] origArr) {
		int[] inArr = new int[origArr.length];
		for (int i = 0; i < origArr.length; i++) {
			inArr[i] = origArr[i];
		}
		System.out.println("Input Array: " + Arrays.toString(inArr));
		System.out.println("The unique numbers in the array are: ");
		boolean uniqueFlag;
		for (int index = 0; index < inArr.length; index++) {
			uniqueFlag = true;
			for (int innerIndex = index + 1; innerIndex < inArr.length; innerIndex++) {
				if (inArr[index] == inArr[innerIndex] && inArr[index] != 0) {
					uniqueFlag = false;
					inArr[index] = 0;
					inArr[innerIndex] = 0;
					break;
				}
			}
			if (uniqueFlag && inArr[index] != 0) {
				System.out.println(inArr[index]);
			}
		}
	}

	// method to print missing numbers from given array from range 1 to 10.
	void displayMissingNumbers(int[] origArr) {
		int[] inArr = new int[origArr.length];
		for (int i = 0; i < origArr.length; i++) {
			inArr[i] = origArr[i];
		}
		System.out.println("Input Array: " + Arrays.toString(inArr));
		System.out.println("Range : 1 to 10");
		System.out.println("Missing numbers are: ");
		boolean flag;
		for (int num = 1; num <= 10; num++) {
			flag = true;
			for (int index = 0; index < inArr.length; index++) {
				if (inArr[index] == num) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num);
			}
		}
	}

	// method to print duplicate names from given array (do not consider case sensitivity).
	void displayDuplicateNames(String[] name) {
		boolean duplicateFlag;
		System.out.println("Input String : " + Arrays.toString(name));
		System.out.println("Duplicate names in given array are: ");
		for (int index = 0; index < name.length; index++) {
			name[index] = name[index].toLowerCase();
			duplicateFlag = true;
			for (int innerIndex = index + 1; innerIndex < name.length; innerIndex++) {
				name[innerIndex] = name[innerIndex].toLowerCase();
				if (name[index].equals(name[innerIndex]) && name[index] != " ") {
					name[innerIndex] = " ";
					duplicateFlag = false;
				}
			}
			if (!duplicateFlag) {
				System.out.println(name[index]);
				name[index] = " ";
			}
		}
	}

	// method to print unique names from given array.
	void displayUniqueNames(String[] name) {
		boolean uniqueFlag;
		System.out.println("Input Array: " + Arrays.toString(name));
		System.out.println("Unique names in the given array are: ");
		for (int index = 0; index < name.length; index++) {
			uniqueFlag = true;
			for (int innerIndex = 0; innerIndex < name.length; innerIndex++) {
				if (name[index].equals(name[innerIndex]) && index != innerIndex) {
					uniqueFlag = false;
					break;
				}
			}
			if (uniqueFlag) {
				System.out.println(name[index]);
			}
		}
	}

	// method to print unique numbers from given array (all content uniquely)
	void displayAllNumbersUniquely(int[] inArr) {
		System.out.println("Input Array: " + Arrays.toString(inArr));
		System.out.println("All contents uniquely are: ");
		for (int index = 0; index < inArr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < inArr.length; innerIndex++) {
				if (inArr[index] == inArr[innerIndex] && inArr[index] != 0) {
					inArr[innerIndex] = 0;
				}
			}
			if (inArr[index] != 0) {
				System.out.println(inArr[index]);
			}
			inArr[index] = 0;
		}
	}

	// print each number with its frequency.
	void displayNumbersAndItsFrequency(int[] inArr) {
		int count;
		System.out.println("InputArray : " + Arrays.toString(inArr));
		for (int index = 0; index < inArr.length; index++) {
			count = 1;
			for (int innerIndex = index + 1; innerIndex < inArr.length; innerIndex++) {
				if (inArr[index] == inArr[innerIndex] && inArr[index] != 0) {
					count++;
					inArr[innerIndex] = 0;
				}
			}
			if (inArr[index] != 0) {
				System.out.println(inArr[index] + "-> " + count + " times");
			}
			inArr[index] = 0;
		}
	}

	public static void main(String[] args) {
		ArrayAndString obj = new ArrayAndString();

		int[] arr1 = { 10, 20, 10, 44, 33, 55, 33 };

		obj.displayDuplicateNumbers(arr1);
		System.out.println("\n");

		obj.displayUniqueNumbers(arr1);
		System.out.println("\n");

		obj.displayAllNumbersUniquely(arr1);
		System.out.println("\n");

		int[] arr2 = { 1, 3, 9, 5, 6, 10 };
		obj.displayMissingNumbers(arr2);
		System.out.println("\n");

		String[] name1 = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		obj.displayDuplicateNames(name1);
		System.out.println("\n");

		String[] name2 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		obj.displayUniqueNames(name2);
		System.out.println("\n");

		int[] arr3 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		obj.displayNumbersAndItsFrequency(arr3);
	}
}
