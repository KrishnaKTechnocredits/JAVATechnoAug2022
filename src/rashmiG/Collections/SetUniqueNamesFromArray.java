/*Assignment 39 : 15th Oct'2022

Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]*/

package rashmiG.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetUniqueNamesFromArray {

	LinkedHashSet<String> getUniqueSetOfNames(String[] input) {
		return new LinkedHashSet<String>(Arrays.asList(input));
	}

	Set<String> getUniqueSetOfNames1(String[] input) {
		Set<String> setOfUniqueNames = new LinkedHashSet<String>();
		List<String> listOfNames = Arrays.asList(input);
		for (String name : listOfNames) {
			if (!setOfUniqueNames.add(name)) {
				continue;
			}
		}
		return setOfUniqueNames;
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.println("outputSetOfUniqueNames: " + new SetUniqueNamesFromArray().getUniqueSetOfNames(input));
	}
}