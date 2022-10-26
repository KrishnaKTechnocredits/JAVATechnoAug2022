
/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/

package mohiniA.StringArrayAssignments.Assignment33;

import java.util.Arrays;

public class UniqueNames {
	
	void getUniqueNames(String[] input) {
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] != "") {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i].equals(input[j]) && i != j) {
						input[j] = "";
					}
				}
				System.out.println( input[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Print all unique names from given array.");
		System.out.println("--------------------------------------------");
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("--------------------------------------------");
		new UniqueNames().getUniqueNames(input);
	}

}
