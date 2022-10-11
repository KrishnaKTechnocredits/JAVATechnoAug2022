/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
	*/	
		 
package smitaVetal;

import java.util.Arrays;

public class Assignment33_5 {
	void printUniqueWordsFromArrayNew(String[] arr) {

		System.out.println("\nUnique words from array: ");
		for (int index = 0; index < arr.length; index++) {
			boolean uniqueFlag = true;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index].equalsIgnoreCase(arr[innerIndex]) && index != innerIndex) {
					uniqueFlag = false;
				}
			}
			if (uniqueFlag) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_5 prog = new Assignment33_5();
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Program to print unique words from array!");
		System.out.println("\nInput String array: " + Arrays.toString(input));
		prog.printUniqueWordsFromArrayNew(input);
	}

}
