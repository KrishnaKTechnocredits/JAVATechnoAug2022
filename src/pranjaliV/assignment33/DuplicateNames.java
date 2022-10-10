/*
 Assignment - 33 : 10th Oct'2022

program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
 
 */

package pranjaliV.assignment33;
import java.util.Arrays;

public class DuplicateNames {
	
	void printDuplicateName(String[] input) {
		for(int index=0; index<input.length; index++) {
			int count=1;// initiallise the count to 1 
			input[index]=input[index].toLowerCase(); //to ignore case sensitivity
			for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
				input[innerIndex] = input[innerIndex].toLowerCase(); //to ignore case sensitivity
				if(input[index].equals(input[innerIndex]) && index!=innerIndex && input[innerIndex]!="") {
					input[innerIndex] = "";//if name matches the convert it to "" to ingore comparision in next iteration
					count++;
				}
			}
			if(count>1 ) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNames ex33 = new DuplicateNames();
		
		System.out.println("------------------------------");
		System.out.println("Program 4: print duplicate names from given array (do not consider case sensitivity).");
		String[] input4 = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input = "+Arrays.toString(input4));
		System.out.println("Output:");
		ex33.printDuplicateName(input4);
		System.out.println("");
		

	}

}
