/*Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PrintDuplicateNamesUsingSet {

	void printDuplicateNamesUsingSet(String[] str) {
		List<String> arr = Arrays.asList(str);
		
		LinkedHashSet<String> input = new LinkedHashSet<String>();
		LinkedHashSet<String> result = new LinkedHashSet<String>();
		
		for(String name : arr) {
			if(!input.add(name))
				result.add(name);
		}		
		System.out.println("Duplicate element in array: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 1: Print all duplicate names from \ngiven Array using Set Collection method");
		System.out.println("===========================================");
		String[] input = {"Maulik", "Umesh", "Saroj", "Umesh"};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintDuplicateNamesUsingSet print =  new PrintDuplicateNamesUsingSet();
		print.printDuplicateNamesUsingSet(input);
	}
	
}
