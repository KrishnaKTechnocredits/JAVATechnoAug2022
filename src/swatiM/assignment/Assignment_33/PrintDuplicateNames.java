/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
*/

package swatiM.assignment.Assignment_33;

import java.util.Arrays;

class PrintDuplicateNames{

	void printDuplicateNames(String[] input){
		System.out.println("Duplicate names from given array : ");

		for(int i = 0;i<input.length;i++){
			input[i]=input[i].toLowerCase();
			for(int j=i+1;j<input.length;j++){
				input[j]=input[j].toLowerCase();

				if(input[i].equals(input[j]) && i!=j && input[i]!=""){	
					System.out.println("- > " +input[i]);								
					input[j]="";
				}
			}
		}

	}

	public static void main(String[] args){
		System.out.println("program 4: Print duplicate names from given \narray (do not consider case sensitivity)");
		System.out.println("---------------------------------------");
		String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");		
		new PrintDuplicateNames().printDuplicateNames(input);
	}	
}