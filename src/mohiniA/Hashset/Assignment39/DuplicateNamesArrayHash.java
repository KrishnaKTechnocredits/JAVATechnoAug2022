
/*
 * Assignment 39
 * Program 1: Print all duplicate names from given Array.
input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
 */


package mohiniA.Hashset.Assignment39;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNamesArrayHash {
			
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
			DuplicateNamesArrayHash obj39 = new DuplicateNamesArrayHash();
			String[] input = {"Maulik", "Umesh", "Saroj", "Umesh"};
			System.out.println("Duplicate Name Using HashSet\n");
			System.out.println(Arrays.toString(input));
			System.out.println("-----------------------------");
			obj39.getDuplicateNamesFromArray(input);
		}

}
