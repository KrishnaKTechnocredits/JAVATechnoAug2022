/*Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]
 */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharUsingSet2 {

	LinkedHashSet<String> printUniqueCharsUsingSet(String str) {
		
		LinkedHashSet<String> output = new LinkedHashSet<String>();
		
		for(int index=0;index<str.length();index++) {
			
			String ch = Character.toString(str.charAt(index));
			
			output.add(ch);
			
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Program 3 : Write a program to return unique \n charactersfrom given name Set Collection method");
		System.out.println("================================================");
		String input = "technocredits";
		System.out.println("Input is: "+input+"\n");
		PrintUniqueCharUsingSet2 print =  new PrintUniqueCharUsingSet2();
		LinkedHashSet<String> output =print.printUniqueCharsUsingSet(input);
		System.out.print("Output of unique characters in string is:\n"+output);
	}
	
}
