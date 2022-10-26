/*Print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
*/

package mohiniA.StringArrayAssignments.Assignment33;

import java.util.Arrays;

public class DuplicateNames {
	
	void getDuplicateNames(String[] input){
		System.out.println("Duplicate names from given array : ");
		
		for(int i = 0;i<input.length;i++){
			input[i]=input[i].toLowerCase();
			for(int j=i+1;j<input.length;j++){
				input[j]=input[j].toLowerCase();
				
				if(input[i].equals(input[j]) && i!=j && input[i]!=""){	
					System.out.println(input[i]);								
					input[j]="";
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Print duplicate names from given array ");
		System.out.println("---------------------------------------");
		String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");		
		new DuplicateNames().getDuplicateNames(input);
	}	

}
