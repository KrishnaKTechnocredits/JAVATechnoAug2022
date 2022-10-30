/*Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){
*/
package asthaSrivastava.array.assignments.collections39;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReturnUniqueChar {

	// method to find unique character from given name
	Set<Character> getUniqueCharacter(String name) {
		System.out.println("Input string is " + name);
		LinkedHashSet<Character> nameS = new LinkedHashSet<Character>();
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			nameS.add(ch);
		}
		return nameS;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("\nUnique characters from " + str + " : " + new ReturnUniqueChar().getUniqueCharacter(str));
	}
}
