//program 4: print duplicate names from given array (do not consider case sensitivity). 
//input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
//output : hello
//         ptc

package maheshSantoki.SpecialInterview;

import java.util.Arrays;

public class DuplicatesNames {
	void duplicateName(String[] input){
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
	
	public static void main(String[] args) {
		DuplicatesNames duplicatename=new DuplicatesNames();
		String input[] = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Given Array : "+Arrays.toString(input));
		duplicatename.duplicateName(input);
	}
}
