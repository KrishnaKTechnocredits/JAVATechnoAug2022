/*
                                                   cvv  b bn                           * Assignment - 33 : 10th Oct'2022

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
program 8 : print exact 1 missing numbers from given array from range 1 to 5. 
input : {1,3,2,5}
output : 4
	
 */

package akankshaVyas.Arraypkg;

import java.util.Arrays;

public class Assignement33 {

	int getMissingNum1n5(int[] arr) {
		int n = 5;
		int expectedSum = (n * (n + 1) / 2); // formula to calculate sum for 1 to 5 range
		int sum = 0;
		for (int num : arr)
			sum = sum + num;
		return expectedSum - sum;
	}

	void missingNum(int[] arr) {
		System.out.println("Given array is - " + Arrays.toString(arr));
		System.out
				.println("output of program 3 : print missing numbers from given array from range 1 to 10 as below: ");

		for (int num = 1; num <= 10; num++) {
			boolean isMissingNumFlag = true;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isMissingNumFlag = false;
					break;
				}
			}

			if (isMissingNumFlag)
				System.out.println(num);
		}

	}

	int getReplaceNum(int[] arr) {
		int replaceNum = 0;
		int min = arr[0];
		boolean isZeroAvailable = false;

		for (int num : arr) {
			if (num == 0)
				isZeroAvailable = true;
			if (num < min)
				min = num;
		}
		return isZeroAvailable ? min - 1 : replaceNum;
	}

	void getDuplicateNum(int[] arr) {
		System.out.println("given array is " + Arrays.toString(arr));
		System.out.println("Replacement num is : " + getReplaceNum(arr));
		System.out.println("Answer of Program 1: print duplicate numbers from given array as below : ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			if (arr[index] != getReplaceNum(arr)) {
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
					if (arr[index] == arr[innerIndex]) {
						count++;
						arr[innerIndex] = getReplaceNum(arr);
					}
				}
			}
			if (count > 0) // && arr[index] != getReplaceNum(arr) )
				System.out.println(arr[index]);
		}
	}

	void getDuplicateName(String[] arr) {
		System.out.println("Given String array is " + Arrays.toString(arr));
		System.out.println(
				"Answer of program 4: print duplicate names from given array (do not consider case sensitivity). as below : ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index].equalsIgnoreCase(arr[innerIndex])) {
					count++;
					arr[innerIndex] = "";
				}
			}
			if (count > 0 && arr[index] != "") {
				arr[index] = arr[index].toLowerCase(); // to print output in lower case
				System.out.println(arr[index]);
			}
		}
	}

	void printUniqueName(String[] arr) {
		System.out.println("Given String array is -" + Arrays.toString(arr));
		System.out.println("Output of program 5 : print unique names from given array. as below : ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (index != innerIndex && arr[index].equals(arr[innerIndex])) {
					count++;
					arr[innerIndex] = "";
					break;
				}
			}
			if (arr[index] != "")
				System.out.println(arr[index]);

		}
	}

	void printUniqueNum(int[] arr) {
		System.out.println("Given array is - " + Arrays.toString(arr));
		System.out.println("output of Program 2 : print unique numbers from given array (having freq 1). ");

		for (int index = 0; index < arr.length; index++) {
			boolean isUniqueNumFlag = true;

			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					isUniqueNumFlag = false;
					break;
				}
			}
			if (isUniqueNumFlag) {
				System.out.println(arr[index]);
			}
		}

	}

	void printNumOneTime(int[] arr) {
		System.out.println("Given array is - " + Arrays.toString(arr));
		System.out.println(
				"output of Program 6 : print unique numbers from given array (all content uniquely) as below: ");

		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					arr[innerIndex] = 0;
					break;
				}
			}
			if (arr[index] > 0) {
				System.out.println(arr[index]);
			}
		}

	}

	void printNumWithFrequency(int[] arr) {
		System.out.println("Given array is - " + Arrays.toString(arr));
		System.out.println("Output of program 7 : print each number with its frequency. ");
		for (int index = 0; index < arr.length; index++) {
			int count = 1;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					count++;
					arr[innerIndex] = 0;
				}
			}
			if (arr[index] > 0) {
				System.out.println(arr[index] + "-->" + count);
			}
		}

	}

	public static void main(String[] args) {
		Assignement33 as = new Assignement33();
		int[] input = { 1, 3, 2, 5 };
		System.out.println("Program-8 print exact 1 missing numbers from given array from range 1 to 5. ");
		System.out.println("Answer of Program-8: Missing num in between 1 to 5 is -> " + as.getMissingNum1n5(input));
		System.out.println("=================================================================");
		int[] input3 = { 1, 3, 9, 5, 6, 10 };
		as.missingNum(input3);
		System.out.println("====================================================================");
		int[] input1 = { 10, 20, 10, 44, 33, 55, 33 };
		as.getDuplicateNum(input1);
		System.out.println("========================================================================");
		String[] input4 = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		as.getDuplicateName(input4);
		System.out.println("=======================================================================");
		String[] input5 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		as.printUniqueName(input5);
		System.out.println("======================================================================================");
		int[] input2 = { 10, 20, 10, 44, 33, 55, 33 };
		as.printUniqueNum(input2);
		System.out.println(
				"============================================================================================");
		as.printNumOneTime(input2);
		System.out.println("===============================================================");
		int[] input7 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		as.printNumWithFrequency(input7);
	}
}
