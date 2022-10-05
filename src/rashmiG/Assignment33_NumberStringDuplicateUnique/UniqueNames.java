/*Assignment - 33 : 1st Oct'2022
program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

//import java.util.Arrays;
import java.util.Scanner;

public class UniqueNames {

	static void displayAllUniqueNames(String[] input) {
		System.out.println(input[0]);
		for (int index = 1; index < input.length; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < index; innerIndex++) {
				if (input[index].equals(input[innerIndex])) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(input[index]);
		}

	}

	static void UniqueNamesAnotherApproach(String[] input) {
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] != "") {
					if (input[index].equals(input[innerIndex])) {
						input[innerIndex] = "";
					}
				}
			}
			if (input[index] != "")
				System.out.println(input[index]);
		}

	}

	public static void main(String[] args) {
//		String[] input = {"Hello","Hi", "Hello", "Hello","Techno","Credits","Techno","Hello","Hi","Hello"};
//		System.out.println(Arrays.toString(input));
//		UniqueNamesAnotherApproach(input);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names you want to enter");
		int size = sc.nextInt();
		String[] input = new String[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + (index + 1));
			input[index] = sc.next();
		}
		System.out.println("\noutput");
		System.out.println("\nApproach1");
		displayAllUniqueNames(input);
		System.out.println("\nApproach2");
		UniqueNamesAnotherApproach(input);
		sc.close();
	}
}
