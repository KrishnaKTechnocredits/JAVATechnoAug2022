/*
 Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]

 */

package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueNameHashSet {
	LinkedHashSet<String> listOfUniqueSet = new LinkedHashSet<String>();

	LinkedHashSet<String> getUniqueNameHashSet(String[] arr) {
		for (String name : arr) {
			listOfUniqueSet.add(name);
		}
		return listOfUniqueSet;
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh", "Saroj" };
		LinkedHashSet<String> OutPutUniqueSet = new LinkedHashSet<String>();
		System.out.println("Input list" + Arrays.toString(input));
		UniqueNameHashSet uniqueNameHashSet = new UniqueNameHashSet();
		OutPutUniqueSet = uniqueNameHashSet.getUniqueNameHashSet(input);
		System.out.println("Outpust List :" + OutPutUniqueSet);
	}

}
