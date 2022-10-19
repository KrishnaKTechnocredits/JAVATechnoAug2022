/*
 * Assignment 39
 * Program 2 : Return unique names from given Array.
 * String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */
package harshalRane.Assignments.assignment39;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueNamesFromArrayUsingHashSet {
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
		UniqueNamesFromArrayUsingHashSet uniqueNames = new UniqueNamesFromArrayUsingHashSet();
		System.out.println("\n---------Unique names using HashSet---------");
		System.out.println(uniqueNames.getUniqueNamesFromArray(input));
		
		System.out.println("\n--------Unique names using LinkedHashSet----------");
		System.out.println(uniqueNames.getUniqueNamesFromArrayLinkedHashSet(input));
	}
}
