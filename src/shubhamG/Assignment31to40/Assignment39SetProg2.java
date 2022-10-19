package shubhamG.Assignment31to40;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
*/
public class Assignment39SetProg2 {

	LinkedHashSet<String> returnUniqueName(String[] arr) {
		LinkedHashSet<String> unique = new LinkedHashSet<String>();
		for (String name : arr) {
			unique.add(name);
		}
		return unique;
	}

	public static void main(String[] args) {
		Assignment39SetProg2 uniqueName = new Assignment39SetProg2();

		String[] str = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("Input Array is : \n" + Arrays.toString(str));
		
		LinkedHashSet<String> output = uniqueName.returnUniqueName(str);
		System.out.println("\nUnique names from given input list are: \n" + output);
	}
}
