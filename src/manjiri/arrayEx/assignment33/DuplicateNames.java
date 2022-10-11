/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNames {
	
	void printDuplicateNames(String[] input) {
		for(int index = 0; index < input.length; index++) {
			boolean flag = false;
			if(!input[index].equals("")) {
				for(int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
					if(input[index].equalsIgnoreCase(input[innerIndex])) {
						input[innerIndex] = "";
						flag = true;
					}
				}
			}
			if (flag) {
				System.out.println(input[index].toLowerCase());
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
		
		new DuplicateNames().printDuplicateNames(inputArr);
	}
}
