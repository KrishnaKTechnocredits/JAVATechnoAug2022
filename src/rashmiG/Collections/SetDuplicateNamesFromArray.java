/*Assignment 39 : 15th Oct'2022

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] */

package rashmiG.Collections;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetDuplicateNamesFromArray {

	void printDuplicateNames(String[] input) {
		// ArrayList<String> outputSet = new ArrayList<String>();
		HashSet<String> outputSet = new HashSet<String>();
		HashSet<String> listOfNames = new HashSet<String>();
		for (String name : input) {
			if (!listOfNames.add(name))// if (!listOfNames.add(name) && !outputSet.contains(name))
				outputSet.add(name);
		}
		System.out.println(outputSet);
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh", "Maulik", "Maulik" };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.print("OutpuSet: ");
		new SetDuplicateNamesFromArray().printDuplicateNames(input);

	}
}
