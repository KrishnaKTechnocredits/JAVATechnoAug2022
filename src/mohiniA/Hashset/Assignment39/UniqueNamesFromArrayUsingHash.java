
/*
 * Assignment 39
 * Program 2 : Return unique names from given Array.
 * String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */

package mohiniA.Hashset.Assignment39;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueNamesFromArrayUsingHash {
	
	HashSet<String> getUniqueNamesFromArray(String[] input) {
		HashSet<String> setOfNames = new HashSet<String>();
		for(String name : input) {
			setOfNames.add(name);
		}
		return setOfNames;
	}
	
	LinkedHashSet<String> getUniqueNamesFromArrayLinkedHashSet(String[] input) {
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>();
		for(String name : input) {
			setOfNames.add(name);
		}
		return setOfNames;
	}
	
	public static void main(String[] args) {
		String[] input = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		System.out.println(Arrays.toString(input));
		UniqueNamesFromArrayUsingHash obj39 = new UniqueNamesFromArrayUsingHash();
		System.out.println("-----------------------------------------------");
		System.out.println("\nUnique names using HashSet");
		System.out.println(obj39.getUniqueNamesFromArray(input));
		System.out.println("------------------------------------------");
		System.out.println("\nUnique names using LinkedHashSet");
		System.out.println(obj39.getUniqueNamesFromArrayLinkedHashSet(input));
		System.out.println("------------------------------------------");
	}

}
