package vibhaS.Assignment;

public class Assignment33 {

	// Write a program to find duplicate number
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

	// Write a program to find unique number
	void printUniqueNum(int[] arr) {
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

	// Write a program to print missing number from array Range(1-10)
	void printMissingNum(int[] arr) {
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

	// print duplicate names from given array(do not consider case sensitivity)
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

	// Write a program to find Unique name in given array
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

	// Write a program to print unique number from given array(all content uniquely)
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

	// print each number with its frequency
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
		int[] arr = { 10, 20, 10, 44, 33, 55, 33 };
		assignment33.printDuplicateNum(arr);
		System.out.println("");
		assignment33.printUniqueNum(arr);
		System.out.println("");
		int[] arr1 = { 1, 3, 9, 5, 6, 10 };
		assignment33.printMissingNum(arr1);
		System.out.println("");
		String[] str = { "Hi", "HELLo", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		assignment33.printDuplicateName(str);
		System.out.println("");
		String[] str1 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		assignment33.printUniqueName(str1);
		System.out.println("");
		int[] arr2 = { 10, 20, 10, 44, 33, 55, 33 };
		assignment33.printAllUniqueNum(arr2);
		System.out.println("");
		int[] arr3 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		assignment33.printEachNumFrequency(arr3);
	}
}
