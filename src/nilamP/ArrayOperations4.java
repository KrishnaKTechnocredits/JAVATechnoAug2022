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
         4 -> 1*/
package nilamP;

import java.util.Arrays;

public class ArrayOperations4 {
	void getDuplicateNum(int[] input) {
		int[] temp = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					temp[j] = input[j];
				}
			}
			if (temp[i] > 0) {
				System.out.println(temp[i]);
			}
		}

	}

	void getUniqueNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == input[i] && i != j) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(input[i]);
			}
		}
	}

	void findMissignNum(int[] input) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = true;
			for (int j = 0; j < input.length; j++) {
				if (i == input[j]) {
					flag = false;
				}

			}
			if (flag) {
				System.out.println(i);
			}
		}
	}

	void getDuplicateName(String[] str) {
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].toLowerCase();
			for (int j = i + 1; j < str.length; j++) {
				str[j] = str[j].toLowerCase();
				if (str[i].equals(str[j]) && i != j) {
					System.out.println(str[i]);
				}
			}
		}
	}

	void getUniqueNames(String[] str) {
		for (int i = 0; i < str.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && i != j) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(str[i]);

			}
		}

	}

	void getUniqueNumber(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					input[j] = 0;
				}
			}
			if (input[i] > 0) {
				System.out.println(input[i]);
			}
		}
	}

	void getCountOfUniqueNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int count = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					input[j] = 0;
					count++;
				}
			}
			if (input[i] > 0) {
				System.out.println(input[i] + "--" + count);
			}
		}
	}

	public static void main(String[] args) {
		ArrayOperations4 ao = new ArrayOperations4();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("program 1 output : ");
		System.out.println("Input Numbers : " + Arrays.toString(input));
		System.out.println("Duplicate Numbers : ");
		ao.getDuplicateNum(input);
		System.out.println("program 2 output : ");
		System.out.println("Unique Numbers : ");
		ao.getUniqueNum(input);
		int[] input1 = { 1, 3, 9, 5, 6, 10 };
		System.out.println("program 3 output : ");
		System.out.println("Missing numbers : ");
		ao.findMissignNum(input1);

		System.out.println("program 4 output :");
		String[] names = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		System.out.println("input :" + Arrays.toString(names));
		System.out.println("Duplicate names :");
		ao.getDuplicateName(names);

		System.out.println("program 5 output :");
		String[] names1 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Input : " + Arrays.toString(names1));
		System.out.println("Unique names :");
		ao.getUniqueNames(names1);

		System.out.println("program 6 output :");
		int[] numbers = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input : " + Arrays.toString(numbers));
		System.out.println("Unique numbers :");
		ao.getUniqueNumber(numbers);

		System.out.println("program 7 output :");
		int[] numbers1 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Input : " + Arrays.toString(numbers1));
		System.out.println("Unique numbers count  :");
		ao.getCountOfUniqueNum(numbers1);
	}
}
