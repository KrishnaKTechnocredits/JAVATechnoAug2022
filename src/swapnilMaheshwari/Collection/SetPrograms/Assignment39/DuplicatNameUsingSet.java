/*
 Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
 */

package swapnilMaheshwari.Collection.SetPrograms.Assignment39;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicatNameUsingSet {
	HashSet<String> listOfSet = new HashSet<String>();
	HashSet<String> outPutSetList = new HashSet<String>();

	void getDuplicateNameUsingHashSet(String[] arr) {
		for (String name : arr) {
			boolean flag = listOfSet.add(name);
			if (flag == false) {
				outPutSetList.add(name);
			}
		}
		System.out.println("Duplicate name in the list: " + outPutSetList);
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh" };
		System.out.println("Input list" + Arrays.toString(input));
		new DuplicatNameUsingSet().getDuplicateNameUsingHashSet(input);
	}

}
