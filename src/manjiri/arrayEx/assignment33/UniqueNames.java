/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNames {

	void printUniqueNames(String[] input) {
		for (int index = 0; index < input.length; index++) {
			// compare outer index with each inner index and check if match found
			if (!input[index].equals("")) {
				for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
					if (input[index].equalsIgnoreCase(input[innerIndex]) && index != innerIndex) {
						input[innerIndex] = "";
					}
				}
				if (input[index] != "")
					System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int length = sc.nextInt();

		String[] inputArr = new String[length];
		for (int index = 0; index < inputArr.length; index++) {
			inputArr[index] = sc.next();
		}
		sc.close();

		System.out.println(Arrays.toString(inputArr));
		System.out.println("=========================================================");

		new UniqueNames().printUniqueNames(inputArr);
	}
}
