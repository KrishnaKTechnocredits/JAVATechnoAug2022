/*
 * program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class DuplicateNamesArray {
	void getDuplicateNamesFromArray(String[] input) {
		System.out.println("Duplicate names from given array are: ");
		for(int index=0;index<input.length;index++) {
			input[index]=input[index].toLowerCase();
			int count=1;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index].equalsIgnoreCase(input[innerIndex]) && input[innerIndex]!="") {
					input[innerIndex]= "";
					count++;
				}
			}
			if(count>1) {
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateNamesArray d = new DuplicateNamesArray();
		String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input Array "+ Arrays.toString(input));
		d.getDuplicateNamesFromArray(input);
		
	}
}
