package nehaniG;

import java.util.Arrays;

public class Assignment33 {

	
	void printDuplicateNum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != 0) {
					arr[j] = 0;
					count++;
				}
			}
			if (count > 1) {
				System.out.println(" Number is duplicate " + arr[i]);
			}
		}
	}

	
	void printUniqueNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != 0) {
					arr[j] = 0;
					count++;
				}
			}
			if (count == 1 && arr[i] != 0) {
				System.out.println("Number is unique " + arr[i]);
			}
		}
	}


	void printMissingNumber(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Missing number is => " + i);
			}
		}
	}

	
	void printDuplicateName(String[] str) {
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j]) && !str[j].equals("")) {
					str[j] = "";
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Word is duplicate => " + str[i]);
			}
		}
	}

	
	void printUniqueName(String[] str) {
		System.out.println("All Unique names");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && !str[j].equals("")) {
					str[j] = "";

				}
			}
			if (!str[i].equals("")) {
				System.out.println(str[i]);
			}
		}
	}

	
	void printAllUniqueNum(int[] arr) {
		System.out.println("All Unique number");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != 0) {
					arr[j] = 0;
				}
			}
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	
	void printEachNumFrequency(int[] arr) {
		System.out.println("Frequency of Each number");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != 0) {
					arr[j] = 0;
					count++;
				}
			}
			if (count >= 1 && arr[i] != 0) {
				System.out.println(arr[i] + " Frequency is => " + count);
			}
		}
	}

	public static void main(String[] args) {
		
			Assignment33 assignment33 = new Assignment33();
			int[] numbers = {10,20,10,44,33,55,33};
			System.out.println("Program 1 Input: "+ Arrays.toString(numbers));
			System.out.println("Output: ");
			assignment33.printDuplicateNum(numbers);
			System.out.println("-------------------------------------------------------------");

			int[] numbers2 = {10,20,10,44,33,55,33};
			System.out.println("Program 2 Input: "+ Arrays.toString(numbers2));
			System.out.println("Output: ");
			assignment33.printUniqueNumber(numbers2);
			System.out.println("-------------------------------------------------------------");

			int[] numbers3 = {1,3,9,5,6,10};
			System.out.println("Program 3 Input: "+ Arrays.toString(numbers3));
			System.out.println("Output: ");
			assignment33.printMissingNumber(numbers3);
			System.out.println("-------------------------------------------------------------");

			String[] names = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
			System.out.println("Program 4 Input: "+ Arrays.toString(names));
			System.out.println("Output: ");
			assignment33.printDuplicateName(names);
			System.out.println("-------------------------------------------------------------");

			String[] names1 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
			System.out.println("Program 5 Input: "+ Arrays.toString(names1));
			System.out.println("Output: ");
			assignment33.printUniqueName(names1);
			System.out.println("-------------------------------------------------------------");

			int[] numbers4 = {10,20,10,44,33,55,33};
			System.out.println("Program 6 Input: "+ Arrays.toString(numbers4));
			System.out.println("Output: ");
			assignment33.printAllUniqueNum(numbers4);
			System.out.println("------------------------------------------------------------");

			int[] numbers5 = {10,11,11,10,5,6,5,6,5,5,4};
			System.out.println("Program 7 Input: "+ Arrays.toString(numbers5));
			System.out.println("Output: ");
			assignment33.printEachNumFrequency(numbers5);
			System.out.println("------------------------------------------------------------");
		}

	}