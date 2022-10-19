/*
Assignment - 33 : 10th Oct'2022
program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
 */

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_4 {
	
	void printDuplicateNames(String[]names) {
		
		for(int index=0; index<names.length; index++) {
			boolean isNameDuplicate=false;
			if(!names[index].equals("")) {
				for(int innerIndex=index+1; innerIndex<names.length;innerIndex++) {
					if(names[index].equalsIgnoreCase(names[innerIndex])){
						isNameDuplicate=true;
						names[innerIndex]="";
					}
				}
				
			}
			if(isNameDuplicate)
				System.out.println(names[index]);	
		}
	}
	
	public static void main(String[] args) {
		
		String[]names={"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Given input string array is :");
		System.out.println(Arrays.toString(names));
		System.out.println("Duplicate names from given array are as below:");
		new Assignment33_4().printDuplicateNames(names);
	}
	
}
