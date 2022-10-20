/*
 * Assignment 39
 * Program 1: Print all duplicate names from given Array.
input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
 */
package harshalRane.Assignments.assignment39;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNamesArray {
	// Method to print duplicate names from array using 2 for loops --> Just for practice
	void duplicateNames(String[] input) {
		for(int index=0;index<input.length;index++) {
			int count=1;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex]) {
					input[innerIndex] = "";
					count++;
				}
			}
			if(count>1) {
				System.out.println(input[index]);
			}
		}
	}
	
	//Method to print duplicate names from array using HashSet
	
	void getDuplicateNamesFromArray(String[] input) {
		HashSet<String> setOfNames = new HashSet<String> ();
		boolean flag = true;
		for(String name : input) {
			flag = setOfNames.add(name);
			if(!flag) {
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateNamesArray duplicateNamesArray = new DuplicateNamesArray();
		String[] input = {"Maulik", "Umesh", "Saroj", "Umesh"};
		//System.out.println("----------Duplicate Name Using 2 For Loops ------------");
		//System.out.println(Arrays.toString(input));
		//duplicateNamesArray.duplicateNames(input);
		System.out.println("----------Duplicate Name Using HashSet------------");
		System.out.println(Arrays.toString(input));
		duplicateNamesArray.getDuplicateNamesFromArray(input);
	}
}
