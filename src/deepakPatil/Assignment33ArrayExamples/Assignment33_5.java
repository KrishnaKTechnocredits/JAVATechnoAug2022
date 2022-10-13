/*
Assignment - 33 : 10th Oct'2022
program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
 */

package deepakPatil.Assignment33ArrayExamples;

import java.util.Arrays;

public class Assignment33_5 {
	
	void printNamesOnes(String[]names) {
		
		for(int index=0; index<names.length;index++) {
			if(!names[index].equals("")) {
				for(int innerIndex=index+1;innerIndex<names.length;innerIndex++) {
					if(names[index].equalsIgnoreCase(names[innerIndex])) {
						names[innerIndex]="";
					}
				}
				System.out.println(names[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[]names={"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		System.out.println("Given input string array is: ");
		System.out.println(Arrays.toString(names));
		System.out.println("Printing nemas once from given array:");
		new Assignment33_5().printNamesOnes(names);
	}

}
