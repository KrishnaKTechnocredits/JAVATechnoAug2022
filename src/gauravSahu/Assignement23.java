/*Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits
String getMaxLengthWord(String input){
	
}
String[] arr = input.split(" ");*/

package gauravSahu;

import java.util.Arrays;

public class Assignement23 {
	
	String getMaxLengthWord(String[] input){
		String maxword = " ";
		maxword = input[0];
		for(int index=0;index<input.length;index++) {
			if(maxword.length()<input[index].length()) {
				maxword = input[index];
			}
		}
		return maxword;
	}	
	
	
	public static void main(String[] args) {
		Assignement23 a23 = new Assignement23();
		String input = "Good morning friends this is technocredits";
		String[] arr = input.split(" ");
		String output = a23.getMaxLengthWord(arr);
		System.out.println("Given string is " + Arrays.toString(arr));
		System.out.println("Max length string is " + output);
	}

}
