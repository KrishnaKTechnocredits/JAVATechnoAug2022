/*Program 3 : Write a program to return unique characters from given name.

				input : technocredits
				output : [t,e,c,h,n,o,r,d,i,s]
*/
package gauravSahu;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment39C {
	
	void getUniqueChar(String input) {
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<Character>();
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			uniqueChar.add(ch);
		}System.out.println("Unique Character Output using LinkedHashSet : " + uniqueChar);
	}
	
	void getUniqueCharUsingHashSet(String input) {
		HashSet<Character> uniqueChar = new HashSet<Character>();
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			uniqueChar.add(ch);
		}System.out.println("Unique Character Output using Hashset : " + uniqueChar);
	}
	
	public static void main(String[] args) {
		Assignment39C a39 = new Assignment39C();
		String input = "technocredits";
		System.out.println("Given input : " + input);
		a39.getUniqueChar(input);
		a39.getUniqueCharUsingHashSet(input);
	}

}
