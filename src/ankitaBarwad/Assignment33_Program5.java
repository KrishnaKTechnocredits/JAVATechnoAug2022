/*Assignment - 33 : 10th Oct'2022
program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program5 {
	// program 5 : print unique names from given array.
	void printUniqueNamesFromArray(String[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = 0; index < inputArray.length; index++) {
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index].equalsIgnoreCase(inputArray[innerIndex]) && !(inputArray[innerIndex].equals("")))
						&& !(inputArray[innerIndex].equals(""))) {
					inputArray[innerIndex] = "";
				}
			}
			if (!(inputArray[index].equals(""))) {
				System.out.println(inputArray[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Program5 program5 = new Assignment33_Program5();
		System.out.println("Program 5 : print unique names from given array");
		String inputArray5[] = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		program5.printUniqueNamesFromArray(inputArray5);
	}
}