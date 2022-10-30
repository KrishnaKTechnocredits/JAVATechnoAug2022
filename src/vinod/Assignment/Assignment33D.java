/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello,ptc*/

package vinod.Assignment;

import java.util.Arrays;

public class Assignment33D {
	void getDuplicateString(String[] input ) {
		for(int i = 0; i<input.length;i++) {
			for(int j = i+1;j<input.length;j++) {
				if(input[i].toLowerCase().equals((input)[j].toLowerCase()) && input[j]!=" ") {
					input[j]=" ";
					System.out.println("Duplicate string is : " + input[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment33D assign = new Assignment33D();
		String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Given string is : " + Arrays.toString(input));
		assign.getDuplicateString(input);
	}
}
