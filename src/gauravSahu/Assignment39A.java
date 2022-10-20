/*Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
*/
package gauravSahu;

import java.util.Arrays;
import java.util.HashSet;

public class Assignment39A {

	void getDuplicateName(String[] input) {
		System.out.println("Program 1: Print all duplicate names from given Array.");
		System.out.println("Input array : " + Arrays.toString(input));
		
		HashSet<String> nameArray1 = new HashSet<String>();
		HashSet<String> nameArray2 = new HashSet<String>();
		for (String name : input) {
			if (!nameArray1.add(name)) {
				nameArray2.add(name);
			}
		}
		System.out.println("Output : " + nameArray2);
	}

	void getDuplicateNameUsingLoop(String[] input) {
		System.out.println("--------------------------------------");
		System.out.println("Program 1 Print all duplicate names from given Array using loop : ");
		//"Maulik", "Umesh", "Saroj", "Umesh" 
		
		for (int index = 0; index < input.length; index++) {
			boolean flag = false;  
			
			for (int index2 = index + 1; index2 < input.length; index2++) {
				if (input[index].equals(input[index2])) {
					input[index2] = " ";
					flag = true;
				}
			}
			if (flag) {
				System.out.println( "Output using loop : " + input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment39A a39 = new Assignment39A();
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh" };
		a39.getDuplicateName(input);
		a39.getDuplicateNameUsingLoop(input);

	}

}
