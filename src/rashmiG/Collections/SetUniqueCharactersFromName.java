/*Assignment 39 : 15th Oct'2022

Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){

}*/

package rashmiG.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetUniqueCharactersFromName {

	Set<Character> getUniqueCharacter(String input) {
		Set<Character> setOfUniqueCharacter = new LinkedHashSet<Character>();
		char[] arr = input.toCharArray();
		for (char ch : arr) {
			setOfUniqueCharacter.add(ch);
		}
		return setOfUniqueCharacter;
	}

	public static void main(String[] args) {
		String input = "technocreditsSTtr";//"technocredits";
		System.out.println("input: " + input);
		System.out
				.println("OutputSetOfUniqueCharacters: " + new SetUniqueCharactersFromName().getUniqueCharacter(input));
	}
}